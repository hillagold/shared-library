def call() {
    node {
        echo "makefile"
        sh "cmake ."
    }
}

