#!/usr/bin/env groovy

package io.issenn
/*
class gradleConstants implements Serializable {

    static void gradle(String command) {
        sh "set +x && ./gradlew ${command}"
    }

    static void gradle_version() {
        gradle '-v'
    }

}
*/

class gradleConstants implements Serializable {
  def steps
  gradleConstants(steps) {this.steps = steps}
  def mvn() {
    return "123"
  }
}