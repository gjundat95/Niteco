-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 20, 2016 at 10:48 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `StudentManager`
--

-- --------------------------------------------------------

--
-- Table structure for table `Chemistry`
--

CREATE TABLE `Chemistry` (
  `id` int(11) NOT NULL,
  `testmark` int(11) NOT NULL,
  `exmark` int(11) NOT NULL,
  `summark` int(11) NOT NULL,
  `idsudent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `Chemistry`
--

INSERT INTO `Chemistry` (`id`, `testmark`, `exmark`, `summark`, `idsudent`) VALUES
(1, 5, 5, 10, 0),
(2, 5, 5, 10, 0),
(3, 9, 7, 16, 1),
(4, 10, 4, 14, 1),
(5, 4, 34, 38, 2),
(6, 3, 4, 7, 3),
(7, 3, 43, 46, 4),
(8, 4, 4, 8, 5),
(9, 34, 2, 36, 6),
(10, 343, 43, 386, 7),
(11, 34, 34, 68, 8),
(12, 434, 34, 468, 9),
(13, 343, 43, 386, 10),
(14, 434, 34, 468, 11),
(15, 34, 34, 68, 12),
(16, 34, 34, 68, 13),
(17, 3, 43, 46, 14),
(18, 4, 34, 38, 15),
(19, 3, 43, 46, 16),
(20, 34, 34, 68, 17),
(21, 34, 34, 68, 18),
(22, 43, 43, 86, 19),
(23, 34, 34, 68, 20),
(24, 5, 9, 14, 40),
(25, 3, 2, 5, 41),
(26, 1, 3, 4, 42),
(27, 2, 2, 4, 43);

-- --------------------------------------------------------

--
-- Table structure for table `Class`
--

CREATE TABLE `Class` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_vietnamese_ci DEFAULT NULL,
  `year` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `Class`
--

INSERT INTO `Class` (`id`, `name`, `year`) VALUES
(1, 'K12B', 2013),
(2, 'K12A', 2013);

-- --------------------------------------------------------

--
-- Table structure for table `Math`
--

CREATE TABLE `Math` (
  `id` int(11) NOT NULL,
  `testmark` int(11) NOT NULL,
  `exmark` int(11) NOT NULL,
  `summark` int(11) NOT NULL,
  `idsudent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `Math`
--

INSERT INTO `Math` (`id`, `testmark`, `exmark`, `summark`, `idsudent`) VALUES
(1, 5, 5, 10, 0),
(2, 5, 5, 10, 1),
(3, 5, 5, 10, 0),
(4, 3, 1, 4, 1),
(5, 3, 9, 12, 1),
(6, 4, 5, 9, 2),
(7, 4, 3, 7, 3),
(8, 3, 4, 7, 4),
(9, 4, 3, 7, 5),
(10, 4, 4, 8, 6),
(11, 4, 3, 7, 7),
(12, 43, 43, 86, 8),
(13, 34, 343, 377, 9),
(14, 34, 34, 68, 10),
(15, 43, 43, 86, 11),
(16, 34, 34, 68, 12),
(17, 34, 34, 68, 13),
(18, 34, 34, 68, 14),
(19, 43, 43, 86, 15),
(20, 34, 34, 68, 16),
(21, 43, 4, 47, 17),
(22, 34, 34, 68, 18),
(23, 34, 3, 37, 19),
(24, 4, 34, 38, 20),
(25, 34, 34, 68, 21),
(26, 5, 7, 12, 40),
(27, 2, 4, 6, 41),
(28, 4, 2, 6, 42),
(29, 2, 3, 5, 43),
(30, 1, 2, 3, 40);

-- --------------------------------------------------------

--
-- Table structure for table `Physics`
--

CREATE TABLE `Physics` (
  `id` int(11) NOT NULL,
  `testmark` int(11) NOT NULL,
  `exmark` int(11) NOT NULL,
  `summark` int(11) NOT NULL,
  `idsudent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `Physics`
--

INSERT INTO `Physics` (`id`, `testmark`, `exmark`, `summark`, `idsudent`) VALUES
(1, 5, 5, 10, 0),
(2, 5, 5, 10, 0),
(3, 6, 7, 13, 1),
(4, 9, 9, 18, 1),
(5, 3, 4, 7, 2),
(6, 4, 4, 8, 3),
(7, 3, 4, 7, 4),
(8, 4, 2, 6, 5),
(9, 3, 4, 7, 6),
(10, 434, 34, 468, 7),
(11, 434, 34, 468, 8),
(12, 43, 43, 86, 9),
(13, 34, 34, 68, 10),
(14, 43, 43, 86, 11),
(15, 34, 34, 68, 12),
(16, 34, 34, 68, 13),
(17, 34, 34, 68, 14),
(18, 43, 43, 86, 15),
(19, 34, 34, 68, 16),
(20, 34, 34, 68, 17),
(21, 34, 34, 68, 18),
(22, 43, 43, 86, 19),
(23, 34, 34, 68, 20),
(24, 8, 6, 14, 40),
(25, 5, 3, 8, 41),
(26, 2, 2, 4, 42),
(27, 4, 4, 8, 43);

-- --------------------------------------------------------

--
-- Table structure for table `Student`
--

CREATE TABLE `Student` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `age` int(11) NOT NULL,
  `idclass` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `Student`
--

INSERT INTO `Student` (`id`, `name`, `age`, `idclass`) VALUES
(40, 'Ngo Doan Tinh', 21, 1),
(41, 'Ngo Doan Tinh', 21, 1),
(42, 'Duc Daik', 22, 1),
(43, 'Tinh Ngo', 21, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Chemistry`
--
ALTER TABLE `Chemistry`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Class`
--
ALTER TABLE `Class`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Math`
--
ALTER TABLE `Math`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Physics`
--
ALTER TABLE `Physics`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Chemistry`
--
ALTER TABLE `Chemistry`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `Class`
--
ALTER TABLE `Class`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `Math`
--
ALTER TABLE `Math`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `Physics`
--
ALTER TABLE `Physics`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `Student`
--
ALTER TABLE `Student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
