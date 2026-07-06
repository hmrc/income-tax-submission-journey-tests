import sbt.*

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"                %% "ui-test-runner"          % "0.54.0",
    "io.cucumber"                %% "cucumber-scala"          % "8.25.1",
    "io.cucumber"                %  "cucumber-junit"          % "7.19.0",
    "junit"                      %  "junit"                   % "4.13.2",
    "com.novocode"               %  "junit-interface"         % "0.11"
  ).map(_ % Test)
}
