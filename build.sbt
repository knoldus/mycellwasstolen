name := "mycellwasstolen"

version := "1.0-SNAPSHOT"

org.scalastyle.sbt.ScalastylePlugin.Settings

ScctPlugin.instrumentSettings

libraryDependencies ++= Seq(
   jdbc,
   cache,
    "org.postgresql" % "postgresql" % "9.4-1200-jdbc4",
 	"com.typesafe.slick" %% "slick" % "2.1.0",
    "net.liftweb" %% "lift-json" % "2.5-M4",
   "org.scalatest" %   "scalatest_2.10" %  "2.0.M5b" %  "test",
   "com.typesafe" %% "play-plugins-mailer" % "2.2.0",
   "org.mockito" % "mockito-all" % "1.8.5" %  "test",
   "junit"  %  "junit"  %  "4.11" %  "test",
   "com.restfb" % "restfb" % "1.6.12",
   "org.twitter4j" % "twitter4j-core" % "3.0.5",
   "com.amazonaws" % "aws-java-sdk" % "1.6.10",
   "net.sf.opencsv" % "opencsv" % "2.1",
   "org.seleniumhq.selenium" % "selenium-java" % "2.40.0"%  "test")     

play.Project.playScalaSettings

