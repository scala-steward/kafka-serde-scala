addSbtPlugin("com.dwijnand"      % "sbt-travisci"  % "1.1.1")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"       % "1.1.1")
addSbtPlugin("com.geirsson"      % "sbt-scalafmt"  % "1.5.1")
addSbtPlugin("de.heikoseeberger" % "sbt-header"    % "5.0.0")
addSbtPlugin("io.get-coursier"   % "sbt-coursier"  % "1.0.0")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"  % "2.3")
addSbtPlugin("com.github.gseitz" % "sbt-release"   % "1.0.8")
addSbtPlugin("org.scoverage"     % "sbt-scoverage" % "1.6.0-M3")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25" // Needed by sbt-git