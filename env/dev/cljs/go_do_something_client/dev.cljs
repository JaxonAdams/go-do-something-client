(ns ^:figwheel-no-load go-do-something-client.dev
  (:require
    [go-do-something-client.core :as core]
    [devtools.core :as devtools]))

(extend-protocol IPrintWithWriter
  js/Symbol
  (-pr-writer [sym writer _]
    (-write writer (str "\"" (.toString sym) "\""))))

(devtools/install!)

(enable-console-print!)

(core/init!)
