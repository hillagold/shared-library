def call(def pack,def company, def repo) {
    node {
         echo "Packaing with canon & Uploading to repo"
         sh "conan new ${pack} -t"
         sh "conan create . ${company}"
         sh "conan upload ${pack}@${company} -r=${repo} --all"
         echo "${pack}"
         echo "${company}"
    }
}
