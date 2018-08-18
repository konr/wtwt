(ns wtwt.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [wtwt.core-test]))

(doo-tests 'wtwt.core-test)
