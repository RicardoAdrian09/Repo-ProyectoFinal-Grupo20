-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-10-2023 a las 01:20:18
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel_ideal`
--
CREATE DATABASE IF NOT EXISTS `hotel_ideal` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `hotel_ideal`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idTipoDeHabitacion` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idTipoDeHabitacion`, `piso`, `estado`) VALUES
(1, 1, 1, 1),
(2, 1, 1, 1),
(3, 1, 1, 1),
(4, 1, 1, 1),
(5, 1, 1, 1),
(6, 1, 1, 1),
(7, 1, 1, 1),
(8, 1, 1, 1),
(9, 1, 1, 1),
(10, 1, 1, 1),
(11, 1, 1, 1),
(12, 1, 1, 1),
(13, 1, 1, 1),
(14, 1, 2, 1),
(15, 1, 2, 1),
(16, 1, 2, 1),
(17, 1, 2, 1),
(18, 1, 2, 1),
(19, 1, 2, 1),
(20, 1, 2, 1),
(21, 1, 2, 1),
(22, 1, 2, 1),
(23, 1, 2, 1),
(24, 1, 2, 1),
(25, 1, 2, 1),
(26, 1, 2, 1),
(27, 1, 3, 1),
(28, 1, 3, 1),
(29, 1, 3, 1),
(30, 1, 3, 1),
(31, 1, 3, 1),
(32, 1, 3, 1),
(33, 1, 3, 1),
(34, 1, 3, 1),
(35, 1, 3, 1),
(36, 1, 3, 1),
(37, 1, 3, 1),
(38, 1, 3, 1),
(39, 1, 3, 1),
(40, 1, 4, 1),
(41, 1, 4, 1),
(42, 1, 4, 1),
(43, 1, 4, 1),
(44, 1, 4, 1),
(45, 1, 4, 1),
(46, 1, 4, 1),
(47, 1, 4, 1),
(48, 1, 4, 1),
(49, 1, 4, 1),
(50, 1, 4, 1),
(51, 1, 4, 1),
(52, 1, 4, 1),
(53, 1, 5, 1),
(54, 1, 5, 1),
(55, 1, 5, 1),
(56, 1, 5, 1),
(57, 1, 5, 1),
(58, 1, 5, 1),
(59, 1, 5, 1),
(60, 1, 5, 1),
(61, 1, 5, 1),
(62, 1, 5, 1),
(63, 1, 5, 1),
(64, 1, 5, 1),
(65, 1, 5, 1),
(66, 2, 6, 1),
(67, 2, 6, 1),
(68, 2, 6, 1),
(69, 2, 6, 1),
(70, 2, 6, 1),
(71, 2, 6, 1),
(72, 2, 6, 1),
(73, 2, 6, 1),
(74, 2, 6, 1),
(75, 2, 6, 1),
(76, 2, 6, 1),
(77, 2, 6, 1),
(78, 2, 6, 1),
(79, 2, 7, 1),
(80, 2, 7, 1),
(81, 2, 7, 1),
(82, 2, 7, 1),
(83, 2, 7, 1),
(84, 2, 7, 1),
(85, 2, 7, 1),
(86, 2, 7, 1),
(87, 2, 7, 1),
(88, 2, 7, 1),
(89, 2, 7, 1),
(90, 2, 7, 1),
(91, 2, 7, 1),
(92, 2, 8, 1),
(93, 2, 8, 1),
(94, 2, 8, 1),
(95, 2, 8, 1),
(96, 2, 8, 1),
(97, 2, 8, 1),
(98, 2, 8, 1),
(99, 2, 8, 1),
(100, 2, 8, 1),
(101, 2, 8, 1),
(102, 2, 8, 1),
(103, 2, 8, 1),
(104, 2, 8, 1),
(105, 2, 9, 1),
(106, 2, 9, 1),
(107, 2, 9, 1),
(108, 2, 9, 1),
(109, 2, 9, 1),
(110, 2, 9, 1),
(111, 2, 9, 1),
(112, 2, 9, 1),
(113, 2, 9, 1),
(114, 2, 9, 1),
(115, 2, 9, 1),
(116, 2, 9, 1),
(117, 2, 9, 1),
(118, 2, 10, 1),
(119, 2, 10, 1),
(120, 2, 10, 1),
(121, 2, 10, 1),
(122, 2, 10, 1),
(123, 2, 10, 1),
(124, 2, 10, 1),
(125, 2, 10, 1),
(126, 2, 10, 1),
(127, 2, 10, 1),
(128, 2, 10, 1),
(129, 2, 10, 1),
(130, 2, 10, 1),
(131, 3, 11, 1),
(132, 3, 11, 1),
(133, 3, 11, 1),
(134, 3, 11, 1),
(135, 3, 11, 1),
(136, 3, 11, 1),
(137, 3, 11, 1),
(138, 3, 11, 1),
(139, 3, 11, 1),
(140, 3, 11, 1),
(141, 3, 11, 1),
(142, 3, 11, 1),
(143, 3, 11, 1),
(144, 3, 12, 1),
(145, 3, 12, 1),
(146, 3, 12, 1),
(147, 3, 12, 1),
(148, 3, 12, 1),
(149, 3, 12, 1),
(150, 3, 12, 1),
(151, 3, 12, 1),
(152, 3, 12, 1),
(153, 3, 12, 1),
(154, 3, 12, 1),
(155, 3, 12, 1),
(156, 3, 12, 1),
(157, 3, 13, 1),
(158, 3, 13, 1),
(159, 3, 13, 1),
(160, 3, 13, 1),
(161, 3, 13, 1),
(162, 3, 13, 1),
(163, 3, 13, 1),
(164, 3, 13, 1),
(165, 3, 13, 1),
(166, 3, 13, 1),
(167, 3, 13, 1),
(168, 3, 13, 1),
(169, 3, 13, 1),
(170, 3, 14, 1),
(171, 3, 14, 1),
(172, 3, 14, 1),
(173, 3, 14, 1),
(174, 3, 14, 1),
(175, 3, 14, 1),
(176, 3, 14, 1),
(177, 3, 14, 1),
(178, 3, 14, 1),
(179, 3, 14, 1),
(180, 3, 14, 1),
(181, 3, 14, 1),
(182, 3, 14, 1),
(183, 3, 15, 1),
(184, 3, 15, 1),
(185, 3, 15, 1),
(186, 3, 15, 1),
(187, 3, 15, 1),
(188, 3, 15, 1),
(189, 3, 15, 1),
(190, 3, 15, 1),
(191, 3, 15, 1),
(192, 3, 15, 1),
(193, 3, 15, 1),
(194, 3, 15, 1),
(195, 3, 15, 1),
(196, 4, 16, 1),
(197, 4, 17, 1),
(198, 4, 18, 1),
(199, 4, 19, 1),
(200, 4, 20, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `precioTotal` double NOT NULL,
  `cantidadDeDias` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `idTipoDeHabitacion` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `cantidadDePersonas` int(11) NOT NULL,
  `cantCamas` int(11) NOT NULL,
  `tipoDeCamas` varchar(30) NOT NULL,
  `precioPorNoche` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipodehabitacion`
--

INSERT INTO `tipodehabitacion` (`idTipoDeHabitacion`, `tipo`, `cantidadDePersonas`, `cantCamas`, `tipoDeCamas`, `precioPorNoche`) VALUES
(1, 'Estandar Simple', 2, 1, 'Queen', 5),
(2, 'Estandar Doble', 2, 2, 'Individual', 7),
(3, 'Estandar Triple', 3, 2, 'Queen e Individual', 10),
(4, 'Suite Lujo', 2, 1, 'King Size', 20);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipoDeHabitacion` (`idTipoDeHabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHabitacion` (`idHabitacion`),
  ADD KEY `idHuesped` (`idHuesped`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`idTipoDeHabitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `idTipoDeHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipoDeHabitacion`) REFERENCES `tipodehabitacion` (`idTipoDeHabitacion`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
