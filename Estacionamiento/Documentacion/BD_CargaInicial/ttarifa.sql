-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-01-2021 a las 14:37:01
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `estacionamiento`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ttarifa`
--

CREATE TABLE `ttarifa` (
  `id_tarifa` bigint(20) NOT NULL,
  `activo` bit(1) DEFAULT NULL,
  `costo` double DEFAULT NULL,
  `hr_reg` datetime DEFAULT NULL,
  `tipo_usuario` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ttarifa`
--

INSERT INTO `ttarifa` (`id_tarifa`, `activo`, `costo`, `hr_reg`, `tipo_usuario`) VALUES
(1, b'0', 0.5, '2021-01-20 07:33:20', 'visitante'),
(2, b'0', 0.05, '2021-01-20 07:35:06', 'residente'),
(3, b'0', 0, '2021-01-20 07:35:45', 'oficial');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ttarifa`
--
ALTER TABLE `ttarifa`
  ADD PRIMARY KEY (`id_tarifa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ttarifa`
--
ALTER TABLE `ttarifa`
  MODIFY `id_tarifa` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
