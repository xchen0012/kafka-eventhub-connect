name := """kafka-eventhub-connect"""

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= {
  val kafkaVersion = "0.10.2.1"

  Seq(

    // Uncomment to use Akka
    //"com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
    "org.apache.kafka" % "connect-api" % kafkaVersion % "provided",
    "org.apache.kafka" % "connect-json" % kafkaVersion % "provided",
    "junit" % "junit" % "4.12" % "test",
    "com.novocode" % "junit-interface" % "0.11" % "test"
  )
}
