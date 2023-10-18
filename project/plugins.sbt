addSbtPlugin("com.github.sbt"    % "sbt-ci-release"  % "1.5.12")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"    % "2.5.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "5.9.0")
addSbtPlugin("com.thesamet"      % "sbt-protoc"      % "1.0.6")
addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "1.1.2")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.14"
