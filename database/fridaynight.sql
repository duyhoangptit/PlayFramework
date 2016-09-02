-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: fridaynight
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `color` (
  `colorID` int(11) NOT NULL,
  `basicCost` int(11) DEFAULT NULL,
  `costPerPacket` int(11) DEFAULT NULL,
  `throughWage` decimal(19,2) DEFAULT NULL,
  `throughWageBranch` int(11) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`colorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customerID` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`customerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deal`
--

DROP TABLE IF EXISTS `deal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deal` (
  `dealID` int(11) NOT NULL,
  `Customer_customerID` int(11) DEFAULT NULL,
  `totalCost` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `User_userID` int(11) DEFAULT NULL,
  PRIMARY KEY (`dealID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deal`
--

LOCK TABLES `deal` WRITE;
/*!40000 ALTER TABLE `deal` DISABLE KEYS */;
/*!40000 ALTER TABLE `deal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packing`
--

DROP TABLE IF EXISTS `packing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packing` (
  `packingID` int(11) NOT NULL,
  `lot` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `method` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `percent` decimal(19,2) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`packingID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packing`
--

LOCK TABLES `packing` WRITE;
/*!40000 ALTER TABLE `packing` DISABLE KEYS */;
/*!40000 ALTER TABLE `packing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paper`
--

DROP TABLE IF EXISTS `paper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paper` (
  `paperID` int(11) NOT NULL,
  `basicWeight` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `normValue` int(11) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`paperID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paper`
--

LOCK TABLES `paper` WRITE;
/*!40000 ALTER TABLE `paper` DISABLE KEYS */;
/*!40000 ALTER TABLE `paper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paste`
--

DROP TABLE IF EXISTS `paste`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paste` (
  `pasteID` int(11) NOT NULL,
  `basicCost` int(11) DEFAULT NULL,
  `blankSize` int(11) DEFAULT NULL,
  `form` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `paperType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `throughWage` decimal(19,2) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`pasteID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paste`
--

LOCK TABLES `paste` WRITE;
/*!40000 ALTER TABLE `paste` DISABLE KEYS */;
/*!40000 ALTER TABLE `paste` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `productID` int(11) NOT NULL,
  `blankHorizontalPageSize` int(11) DEFAULT NULL,
  `blankVerticalPageSize` int(11) DEFAULT NULL,
  `Color_colorID` int(11) DEFAULT NULL,
  `Color_colorID2` int(11) DEFAULT NULL,
  `colorPlateCost1` int(11) DEFAULT NULL,
  `colorPlateCost2` int(11) DEFAULT NULL,
  `colorPrintBasicCost1` int(11) DEFAULT NULL,
  `colorPrintBasicCost2` int(11) DEFAULT NULL,
  `colorPrintLoss1` int(11) DEFAULT NULL,
  `colorPrintLoss2` int(11) DEFAULT NULL,
  `colorPrintPerPacketCost1` int(11) DEFAULT NULL,
  `colorPrintPerPacketCost2` int(11) DEFAULT NULL,
  `colorPrintSpecial1` decimal(19,2) DEFAULT NULL,
  `colorPrintSpecial2` decimal(19,2) DEFAULT NULL,
  `colorPrintThroughWage1` decimal(19,2) DEFAULT NULL,
  `colorPrintThroughWage2` decimal(19,2) DEFAULT NULL,
  `colorPrintTotalCost1` int(11) DEFAULT NULL,
  `colorPrintTotalCost2` int(11) DEFAULT NULL,
  `cutHorizontalPageSize` int(11) DEFAULT NULL,
  `cutVerticalPageSize` int(11) DEFAULT NULL,
  `Deal_dealID` int(11) DEFAULT NULL,
  `embossing` tinyint(4) DEFAULT NULL,
  `embossingBasicCost` int(11) DEFAULT NULL,
  `embossingThroughWage` decimal(19,2) DEFAULT NULL,
  `embossingTotalCost` int(11) DEFAULT NULL,
  `estimatedSum` int(11) DEFAULT NULL,
  `estimatedUnitPrice` int(11) DEFAULT NULL,
  `fare` int(11) DEFAULT NULL,
  `horizontalPageSize` int(11) DEFAULT NULL,
  `impositionNumber` int(11) DEFAULT NULL,
  `inspection` int(11) DEFAULT NULL,
  `laminationBackBasicThroughWage` int(11) DEFAULT NULL,
  `laminationBackBasicWeight` int(11) DEFAULT NULL,
  `laminationCuttingFlow` int(11) DEFAULT NULL,
  `laminationFlute` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `laminationMediumBasicWeight` int(11) DEFAULT NULL,
  `laminationMediumThroughWage` int(11) DEFAULT NULL,
  `laminationNumber` int(11) DEFAULT NULL,
  `laminationSheetCost` decimal(19,2) DEFAULT NULL,
  `laminationUnitPrice` decimal(19,2) DEFAULT NULL,
  `laminationWidth` int(11) DEFAULT NULL,
  `laminationtotalCost` decimal(19,2) DEFAULT NULL,
  `lotInput` int(11) DEFAULT NULL,
  `managementCost` int(11) DEFAULT NULL,
  `otherCost1` int(11) DEFAULT NULL,
  `otherCost2` int(11) DEFAULT NULL,
  `otherCost3` int(11) DEFAULT NULL,
  `packingFee` int(11) DEFAULT NULL,
  `Packing_packingID` int(11) DEFAULT NULL,
  `paperActualWeight` int(11) DEFAULT NULL,
  `Paper_paperID` int(11) DEFAULT NULL,
  `paperTotalCost` int(11) DEFAULT NULL,
  `paperUnitPrice` decimal(19,2) DEFAULT NULL,
  `pasteBasicCost` int(11) DEFAULT NULL,
  `pasteBlankSize` int(11) DEFAULT NULL,
  `pasteForm` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pasteLoss` int(11) DEFAULT NULL,
  `Paste_pasteID` int(11) DEFAULT NULL,
  `pasteSpecialForm` tinyint(4) DEFAULT NULL,
  `pasteThroughWage` decimal(19,2) DEFAULT NULL,
  `pasteTotalCost` int(11) DEFAULT NULL,
  `productName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `specialColor1` int(11) DEFAULT NULL,
  `specialColor2` int(11) DEFAULT NULL,
  `stampingBasicCost` int(11) DEFAULT NULL,
  `stampingNumber` int(11) DEFAULT NULL,
  `stampingProcessingType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Stamping_stampingID` int(11) DEFAULT NULL,
  `stampingThroughWage` decimal(19,2) DEFAULT NULL,
  `stampingTotalCost` int(11) DEFAULT NULL,
  `strikingBasicCost` int(11) DEFAULT NULL,
  `strikingLoss` int(11) DEFAULT NULL,
  `Striking_strikingID` int(11) DEFAULT NULL,
  `strikingThroughNumber` int(11) DEFAULT NULL,
  `strikingThroughWage` decimal(19,2) DEFAULT NULL,
  `strikingTotalCost` int(11) DEFAULT NULL,
  `strikingWeight` int(11) DEFAULT NULL,
  `subTotal1` int(11) DEFAULT NULL,
  `subTotal2` int(11) DEFAULT NULL,
  `submittedSum` int(11) DEFAULT NULL,
  `submittedUnitPrice` int(11) DEFAULT NULL,
  `surfaceTreatmentBasicCost1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `surfaceTreatmentBasicCost2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SurfaceTreatment_surfaceTreatmentID1` int(11) DEFAULT NULL,
  `SurfaceTreatment_surfaceTreatmentID2` int(11) DEFAULT NULL,
  `surfaceTreatmentThroughWage1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `surfaceTreatmentThroughWage2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `surfaceTreatmentTotalCost1` int(11) DEFAULT NULL,
  `surfaceTreatmentTotalCost2` int(11) DEFAULT NULL,
  `takenNumber` int(11) DEFAULT NULL,
  `throughInput` int(11) DEFAULT NULL,
  `verticalPageSize` int(11) DEFAULT NULL,
  `windowHorizontalSize` int(11) DEFAULT NULL,
  `windowMargin_windowMarginID` int(11) DEFAULT NULL,
  `windowMaterialFee` decimal(19,2) DEFAULT NULL,
  `windowTotalCost` int(11) DEFAULT NULL,
  `windowVerticalSize` int(11) DEFAULT NULL,
  PRIMARY KEY (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stamping`
--

DROP TABLE IF EXISTS `stamping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stamping` (
  `stampingID` int(11) NOT NULL,
  `basicCost` int(11) DEFAULT NULL,
  `blank` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `processingType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `throughWage` decimal(19,2) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`stampingID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stamping`
--

LOCK TABLES `stamping` WRITE;
/*!40000 ALTER TABLE `stamping` DISABLE KEYS */;
/*!40000 ALTER TABLE `stamping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `striking`
--

DROP TABLE IF EXISTS `striking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `striking` (
  `strikingID` int(11) NOT NULL,
  `basicCost` int(11) DEFAULT NULL,
  `impositionNumber` int(11) DEFAULT NULL,
  `paperboardType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `size` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `throughNumber` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `throughWage` decimal(19,2) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`strikingID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `striking`
--

LOCK TABLES `striking` WRITE;
/*!40000 ALTER TABLE `striking` DISABLE KEYS */;
/*!40000 ALTER TABLE `striking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `surfacetreatment`
--

DROP TABLE IF EXISTS `surfacetreatment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `surfacetreatment` (
  `surfaceTreatmentID` int(11) NOT NULL,
  `basicCost` int(11) DEFAULT NULL,
  `size` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `throughNumber` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `throughWage` decimal(19,2) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  `varnishType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`surfaceTreatmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `surfacetreatment`
--

LOCK TABLES `surfacetreatment` WRITE;
/*!40000 ALTER TABLE `surfacetreatment` DISABLE KEYS */;
/*!40000 ALTER TABLE `surfacetreatment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `enable` tinyint(4) DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,1,'1234',1,'hoangtd'),(2,1,'hoang',1,'duyhoangta');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `windowmargin`
--

DROP TABLE IF EXISTS `windowmargin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `windowmargin` (
  `windowMarginID` int(11) NOT NULL,
  `updatedDate` datetime DEFAULT NULL,
  `windowMarginLot` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `windowMarginMaterial` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `windowMarginPrepationFee` int(11) DEFAULT NULL,
  `windowMarginSize` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `windowMarginThroughWage` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`windowMarginID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `windowmargin`
--

LOCK TABLES `windowmargin` WRITE;
/*!40000 ALTER TABLE `windowmargin` DISABLE KEYS */;
/*!40000 ALTER TABLE `windowmargin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-01 18:09:17
