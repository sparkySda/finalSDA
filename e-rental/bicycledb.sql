-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2019 at 03:17 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bicycledb`
--

-- --------------------------------------------------------

--
-- Table structure for table `bike`
--

CREATE TABLE `bike` (
  `bikeID` int(11) NOT NULL,
  `bikeStatus` varchar(10) NOT NULL,
  `bikeType` varchar(10) NOT NULL,
  `bikePrice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bike`
--

INSERT INTO `bike` (`bikeID`, `bikeStatus`, `bikeType`, `bikePrice`) VALUES
(1001, 'BOOKED', 'BMX', 5),
(2001, 'BOOKED', 'Mountain', 6),
(3001, 'available', 'Hybrid', 7),
(4001, 'available', 'Cyclocross', 8),
(1002, 'BOOKED', 'BMX', 5),
(1006, 'available', 'BMX', 5);

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `custName` varchar(20) NOT NULL,
  `bikeID` varchar(10) NOT NULL,
  `bikeType` varchar(10) NOT NULL,
  `pickupBike` varchar(10) NOT NULL,
  `returnBike` varchar(10) NOT NULL,
  `duration` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`custName`, `bikeID`, `bikeType`, `pickupBike`, `returnBike`, `duration`) VALUES
('12112', '1001', 'BMX', '3', '4', '1'),
('0179371387', '1001', 'BMX', '2', '4', '2'),
('0179371387', '1001', 'BMX', '11', '13', '2'),
('arif hamid', '1001', 'BMX', '11', '13', '2'),
('arif hamid', '1001', 'BMX', '3', '5', '2'),
('arif hamid', '1001', 'BMX', '3', '5', '2'),
('arif hamid', '2001', 'BMX', '4', '5', '1'),
('arif hamid', '1001', 'BMX', '2', '4', '2'),
('arif hamid', '2001', 'BMX', '3', '4', '1'),
('arif hamid', '2002', 'BMX', '3', '5', '2'),
('arif hamid', '1002', 'BMX', '3', '4', '1');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerID` varchar(15) NOT NULL,
  `customerName` varchar(20) NOT NULL,
  `customerPass` varchar(15) NOT NULL,
  `address` varchar(30) NOT NULL,
  `phone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `customerName`, `customerPass`, `address`, `phone`) VALUES
('1101', 'arif hamid', '1234', 'MA1 3-520, KTDI', '0179371387'),
('1102', 'akif hakimi', '1234', 'M22-230, KTDI', '0145847929'),
('1233', 'arif', '1234', 'Taman Merbau', '0145847929'),
('0095', 'ariostole_lola', '1', 'Taman Merbau', '12112');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `managerID` int(10) NOT NULL,
  `address` varchar(20) NOT NULL,
  `managerName` varchar(20) NOT NULL,
  `managerPass` varchar(10) NOT NULL,
  `phone` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`managerID`, `address`, `managerName`, `managerPass`, `phone`) VALUES
(9001, 'Taman Merbau', 'Akif Hakimi', '1234', '0179371387'),
(9001, 'Taman Merbau', 'Akif Hakimi', '1234', '0179371387');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `amount` double NOT NULL,
  `paymentID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`amount`, `paymentID`) VALUES
(2, 1101),
(10, 1101),
(10, 1101),
(12, 1101),
(10, 1101),
(12, 1101),
(5, 1101);

-- --------------------------------------------------------

--
-- Table structure for table `utmauthority`
--

CREATE TABLE `utmauthority` (
  `authoID` int(10) NOT NULL,
  `authoName` varchar(15) NOT NULL,
  `authoEmail` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
