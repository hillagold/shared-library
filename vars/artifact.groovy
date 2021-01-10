def call(body) {
    node {
         def config = [:]
         body.resolveStrategy = Closure.DELEGATE_FIRST
         body.delegate = config
         body()
         echo "${config.pack}"
    }
}
