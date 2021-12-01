import sbt._

object Dependencies {

  val test = Seq(
    "uk.gov.hmrc"                %% "webdriver-factory"       % "0.25.0" % Test,
    "org.scalatest"              %% "scalatest"               % "3.2.9" % Test,
    "io.cucumber"                %% "cucumber-scala"          % "7.0.0" % Test,
    "com.typesafe.play"          %% "play-json"               % "2.6.13" % Test,
    "io.cucumber"                %  "cucumber-junit"          % "6.10.4" % Test,
    "junit"                      %  "junit"                   % "4.13.2"  % Test,
    "com.novocode"               %  "junit-interface"         % "0.11"  % Test,
    "com.typesafe"               %  "config"                  % "1.4.1" % Test
  )

}
