-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Lun 04 Avril 2016 à 20:16
-- Version du serveur :  10.1.10-MariaDB
-- Version de PHP :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `GCB`
--

-- --------------------------------------------------------

--
-- Structure de la table `Client`
--

CREATE TABLE `Client` (
  `civilite` varchar(20) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `dateDeNaissance` varchar(20) NOT NULL,
  `cin` varchar(20) NOT NULL,
  `rue` varchar(20) NOT NULL,
  `ville` varchar(20) NOT NULL,
  `pays` varchar(20) NOT NULL,
  `numTel` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pseudo` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Client`
--

INSERT INTO `Client` (`civilite`, `nom`, `prenom`, `dateDeNaissance`, `cin`, `rue`, `ville`, `pays`, `numTel`, `email`, `pseudo`, `pass`) VALUES
('1', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa'),
('1', 'najjar', 'amine', '01/04/16', '06949550', 'rrr', 'vvv', 'ppp', '50406851', 'medaminenajjar@yahoo.fr', 'amine', 'aa'),
('1', 'ee', 'ee', '14/04/16', 'ee', 'ee', 'ee', 'ee', 'ee', 'ee', 'ee', 'ee'),
('1', 'aa', 'aa', '06/04/16', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'rr', 'rr'),
('1', 'ss', 'ss', '08/03/16', 'ss', 'ss', 'ss', 'ss', 'ss', 'ss', 'ss', 'ss'),
('1', 'zz', 'zz', '01/04/16', 'zz', 'zz', 'zz', 'zz', 'zz', 'zz', 'zz', 'zz');

-- --------------------------------------------------------

--
-- Structure de la table `Login`
--

CREATE TABLE `Login` (
  `pseudo` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `ID123` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Login`
--

INSERT INTO `Login` (`pseudo`, `pass`, `ID123`) VALUES
('aa', 'aa', '2'),
('amine', 'aa', '2'),
('ee', 'ee', '2'),
('rr', 'rr', '2'),
('tt', 'tt', '2'),
('zz', 'zz', '2');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Client`
--
ALTER TABLE `Client`
  ADD PRIMARY KEY (`pass`,`pseudo`);

--
-- Index pour la table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`pseudo`,`pass`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
