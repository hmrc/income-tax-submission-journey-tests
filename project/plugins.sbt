resolvers += MavenRepository("HMRC-open-artefacts-maven2", "https://open.artefacts.tax.service.gov.uk/maven2")
resolvers += Resolver.url("HMRC-open-artefacts-ivy2", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)

<<<<<<< HEAD
addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" %  "3.15.0")
=======
addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" %  "3.15.0")
>>>>>>> Property- Adjustments CYA journey test
