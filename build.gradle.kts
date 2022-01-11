import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
  NOTE use the project git@github.com:adligo/2022.git to build this
*/

plugins {
  eclipse
  java
}

sourceSets {
  test {
    java {
      srcDirs("src")
    }
  }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}