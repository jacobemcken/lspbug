(defproject lspbug "0.1.0-SNAPSHOT"
  :description "Project used to reproduce an assumed clojure-lsp bug."
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :repl-options {:init-ns lspbug.core})
