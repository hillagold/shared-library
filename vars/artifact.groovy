def call(def pack,def company) {
    node {
         sh "conan new ${pack} -t"
         sh "conan create . ${company}"
         echo "${pack}"
         echo "${company}"
    }
}
