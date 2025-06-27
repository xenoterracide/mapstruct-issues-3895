plugins {
  `java-library`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  annotationProcessor(platform(libs.immutables.bom))
  annotationProcessor(libs.immutables.core)
  annotationProcessor(libs.mapstruct.processor)
  compileOnly(platform(libs.immutables.bom))
  compileOnly(libs.bundles.immutables)
  compileOnly(libs.mapstruct.core)
  implementation(platform(libs.spring.bom))
  implementation(libs.spring.core)
  implementation(libs.spring.beans)
  implementation(libs.spring.context)
  testImplementation(platform("org.junit:junit-bom:5.10.0"))
  testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<JavaCompile>().configureEach {
  options.compilerArgs.addAll(
    listOf(
      "-Xlint:all",
      "-Xlint:-processing",
      "-Xlint:-serial",
      "-Xlint:-unchecked",
      "-Xlint:-varargs",
      "-Amapstruct.suppressGeneratorTimestamp=true",
      "-Amapstruct.suppressGeneratorVersionInfoComment=true",
      "-Amapstruct.verbose=true",
      "-Amapstruct.defaultComponentModel=spring",
    )
  )
}
