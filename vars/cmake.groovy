def call() {
    node {
        echo "makefile"
        sh "cmake CMakeLists.txt"
    }
}

