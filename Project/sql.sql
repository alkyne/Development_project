DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `rest` varchar(32) NOT NULL,
  `price` int(11) NOT NULL,
  `group` int(11) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,'삼이해장국',1,1),(2,'봉추 찜닭',1,1),(3,'일미 닭갈비',1,1),(4,'북경 깐풍기',1,0),(5,'식끌벅끌 분식',0,2),(6,'요리조리 쿡쿡',0,2),(7,'치코 파닭',1,5),(8,'도니 스토리',0,3),(9,'이닭포차',2,3),(10,'칠돼지 순대',0,1),(11,'장바우',0,2),(12,'도누가 그릴',1,3),(13,'서래 갈매기',2,3),(14,'놀부 부대찌개',0,1),(15,'왕큰손 파닭',1,5),(16,'맘스터치',1,5),(17,'자담돈',1,1),(18,'새마을식당',1,1),(19,'홍콩반점',1,0),(20,'홍콩반점',1,0),(21,'홍s족발',2,1);
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
