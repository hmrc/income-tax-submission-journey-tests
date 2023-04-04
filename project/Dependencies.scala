import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"                %% "webdriver-factory"       % "0.43.0"  % Test,
    "org.scalatest"              %% "scalatest"               % "3.2.15"  % Test,
    "io.cucumber"                %% "cucumber-scala"          % "8.14.1"  % Test,
    "com.typesafe.play"          %% "play-json"               % "2.9.4"   % Test,
    "io.cucumber"                %  "cucumber-junit"          % "7.11.1"  % Test,
    "junit"                      %  "junit"                   % "4.13.2"  % Test,
    "com.novocode"               %  "junit-interface"         % "0.11"    % Test,
    "com.typesafe"               %  "config"                  % "1.4.2"   % Test
  )
}
