-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2018 at 04:13 PM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wheels`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `total_amt` (IN `j_no` VARCHAR(11))  MODIFIES SQL DATA
BEGIN
DECLARE amt INT ;
SET amt=(SELECT SUM(total_cost) FROM `js_sp` WHERE jcno=j_no);
UPDATE `jobcard` SET `Bill_amt`=amt WHERE `JC_no`=j_no;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bill_no` varchar(5) NOT NULL,
  `JC_no` varchar(11) NOT NULL,
  `TotalBill_amt` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`bill_no`, `JC_no`, `TotalBill_amt`) VALUES
('SP1', 'jc1', 80),
('SP3', 'jc2', 150),
('SP4', 'jc3', 270);

--
-- Triggers `bill`
--
DELIMITER $$
CREATE TRIGGER `update_status` AFTER INSERT ON `bill` FOR EACH ROW UPDATE `jobcard` SET `Status`="Delivered" WHERE `JC_no`=new.`JC_no`
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `jobcard`
--

CREATE TABLE `jobcard` (
  `JC_no` varchar(11) NOT NULL,
  `Regno` varchar(10) NOT NULL,
  `jc_Date` date NOT NULL,
  `kms` int(11) NOT NULL,
  `mech_name` varchar(20) NOT NULL,
  `cname` varchar(30) NOT NULL,
  `phno` varchar(11) NOT NULL,
  `model` varchar(15) NOT NULL,
  `colour` varchar(10) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Bill_amt` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jobcard`
--

INSERT INTO `jobcard` (`JC_no`, `Regno`, `jc_Date`, `kms`, `mech_name`, `cname`, `phno`, `model`, `colour`, `Status`, `Bill_amt`) VALUES
('jc1', 'KA04HK8994', '2018-11-20', 899, 'RAJ', 'ASHWIN RAMESH P', '98452026584', 'RTR', 'RED', 'Delivered', 80),
('jc2', 'KA02JH3256', '2018-11-20', 3001, 'RAVI', 'ASHISH ', '8885554441', 'CBR', 'BLUE', 'Delivered', 150),
('jc3', 'ka04hk8994', '2018-11-30', 1000, 'ravi', 'ASHWIN RAMESH P', '98452026584', 'RTR', 'RED', 'Delivered', 270);

-- --------------------------------------------------------

--
-- Table structure for table `js_sp`
--

CREATE TABLE `js_sp` (
  `jcno` varchar(11) NOT NULL,
  `partno` varchar(11) NOT NULL,
  `sqty` int(11) DEFAULT NULL,
  `mrp` int(11) DEFAULT NULL,
  `total_cost` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `js_sp`
--

INSERT INTO `js_sp` (`jcno`, `partno`, `sqty`, `mrp`, `total_cost`) VALUES
('jc1', 'p100', 1, 70, 70),
('jc1', 'p115', 2, 5, 10),
('jc2', 'p100', 1, 80, 80),
('jc2', 'p110', 3, 20, 60),
('jc2', 'p115', 2, 5, 10),
('jc3', 'p115', 2, 10, 20),
('jc3', 'p120', 1, 250, 250);

--
-- Triggers `js_sp`
--
DELIMITER $$
CREATE TRIGGER `decqty` AFTER INSERT ON `js_sp` FOR EACH ROW UPDATE spares s set s.Qty=s.Qty- NEW.sqty WHERE s.PARTNO=NEW.partno
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `delqty` AFTER DELETE ON `js_sp` FOR EACH ROW UPDATE spares s set s.Qty=s.Qty+OLD.sqty WHERE s.PARTNO=OLD.partno
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `updqty` AFTER UPDATE ON `js_sp` FOR EACH ROW UPDATE spares s set s.Qty=s.Qty+(OLD.sqty-NEW.sqty) WHERE s.PARTNO=NEW.partno
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `spares`
--

CREATE TABLE `spares` (
  `PARTNO` varchar(10) NOT NULL,
  `PNAME` varchar(30) NOT NULL,
  `LOCATION` varchar(5) NOT NULL,
  `MRP` float NOT NULL,
  `Qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `spares`
--

INSERT INTO `spares` (`PARTNO`, `PNAME`, `LOCATION`, `MRP`, `Qty`) VALUES
('p100', 'indicator', 's1-25', 80, 3),
('p110', 'gasket', 'k2-69', 15, 46),
('p115', 'nut', 'L4-52', 5, 194),
('p120', 'nos', 'r top', 250, 4);

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `Regno` varchar(10) NOT NULL,
  `Cname` varchar(30) NOT NULL,
  `Phno` varchar(11) NOT NULL,
  `Model` varchar(15) NOT NULL,
  `Colour` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`Regno`, `Cname`, `Phno`, `Model`, `Colour`) VALUES
('KA02JH3256', 'ASHISH ', '8885554441', 'CBR', 'BLUE'),
('KA04HK8994', 'ASHWIN RAMESH P', '98452026584', 'RTR', 'RED'),
('KA51BA4411', 'DIVIJ', '9966332211', 'DIO', 'BLACK');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bill_no`),
  ADD UNIQUE KEY `JC_no` (`JC_no`);

--
-- Indexes for table `jobcard`
--
ALTER TABLE `jobcard`
  ADD PRIMARY KEY (`JC_no`),
  ADD KEY `jobcard_ibfk_1` (`Regno`);

--
-- Indexes for table `js_sp`
--
ALTER TABLE `js_sp`
  ADD PRIMARY KEY (`jcno`,`partno`),
  ADD KEY `js_sp_ibfk_2` (`partno`);

--
-- Indexes for table `spares`
--
ALTER TABLE `spares`
  ADD PRIMARY KEY (`PARTNO`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`Regno`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`JC_no`) REFERENCES `jobcard` (`JC_no`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `jobcard`
--
ALTER TABLE `jobcard`
  ADD CONSTRAINT `jobcard_ibfk_1` FOREIGN KEY (`Regno`) REFERENCES `vehicle` (`Regno`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `js_sp`
--
ALTER TABLE `js_sp`
  ADD CONSTRAINT `js_sp_ibfk_1` FOREIGN KEY (`jcno`) REFERENCES `jobcard` (`JC_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `js_sp_ibfk_2` FOREIGN KEY (`partno`) REFERENCES `spares` (`PARTNO`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
