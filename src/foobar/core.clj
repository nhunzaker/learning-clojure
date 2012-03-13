(ns foobar.core
  (:gen-class :main true))

(defn -main [& args]
  (dotimes [n 10] (println "hi" n)))