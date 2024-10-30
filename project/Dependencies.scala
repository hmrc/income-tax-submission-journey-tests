import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"                %% "ui-test-runner"          % "0.42.0"   % Test,
    "org.scalatest"              %% "scalatest"               % "3.2.18"   % Test,
    "io.cucumber"                %% "cucumber-scala"          % "8.20.0"   % Test,
    "com.typesafe.play"          %% "play-json"               % "2.10.4"   % Test,
    "io.cucumber"                %  "cucumber-junit"          % "7.15.0"   % Test,
    "junit"                      %  "junit"                   % "4.13.2"   % Test,
    "com.novocode"               %  "junit-interface"         % "0.11"     % Test,
    "com.typesafe"               %  "config"                  % "1.4.2"    % Test,
    "ch.qos.logback"             % "logback-classic"          % "1.5.4"    % Test,
    "commons-io"                 %  "commons-io"              % "2.11.0"   % Test,
    "com.vladsch.flexmark"       % "flexmark-all"             % "0.64.8"   % Test,
    "org.scalatestplus"          %% "selenium-4-12"           % "3.2.17.0" % Test
  )

}
