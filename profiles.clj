{:user {
        :plugins [
                  [lein-marginalia "0.7.1"]
                  [lein-deps-tree "0.1.2"]
                  [lein-ritz "0.7.0"]
                  [lein-ring "0.8.7"]
                  [org.clojars.hozumi/hiccup-bridge "1.0.0-SNAPSHOT"]
                  ;; from cldwalker / leinfiles
                  [lein-difftest "2.0.0"]
                  [lein-grep "0.1.0"]
                  [lein-open "0.1.0"]
                  [lein-outdated "1.0.0"]
                  [lein-exec "0.3.0"]
                  ;;[lein-pprint "1.1.1"]
                  ;;[lein-spell "0.1.0"]
                  ]
        :repl-options {
                       :nrepl-middleware [ritz.nrepl.middleware.javadoc/wrap-javadoc
                                          ritz.nrepl.middleware.simple-complete/wrap-simple-complete]
                       :init (do
                               ;;(use '[table.core :only (table)])
                               ;;(use 'desc.core)
                               ;;(use 'rubydoc.core)
                               (use '[clojure.repl :only (dir-fn)])
                               (load-file (str (System/getProperty "user.home") "/.lein/user.clj"))
                               ) }
        :dependencies [[ritz/ritz-nrepl-middleware "0.7.0"]
                       [table "0.4.0"]
                       ;;[desc "0.1.0"]
                       ;;[rubydoc "0.3.0"]
                       ]
        }
 ;; :hooks [ritz.add-sources]
 }
