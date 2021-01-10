def call(def pack,def company, def repo, def repo_type) {
    node {
         echo "Packaing with canon & Uploading to ${repo_type} repo"
         sh "conan new ${pack} -t"
         sh "conan create . ${company}"
         sh "conan upload ${pack}@${company} -r=${repo} --all"
    }
}
