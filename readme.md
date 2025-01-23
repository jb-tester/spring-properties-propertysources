# @PropertySource configuration files

Spring Debugger:

the properties set in the extra files are evaluated, but navigation to source from the evaluation results in debugger
https://youtrack.jetbrains.com/issue/IDEA-366129/Spring-Debugger-properties-evaluation-navigation-to-source-fails-for-properties-set-in-the-PropertySource-files
and by the 'Actual value' inlay fail, if the navigation target is one of these files.
https://youtrack.jetbrains.com/issue/IDEA-366127/Spring-Debugger-navigation-by-the-actual-value-inlay-to-the-properties-set-in-additional-property-files-doesnt-work

Also, there is an issue with the property evaluation if it is set in few files loaded when no active profile is set.
To recreate comment-out the active profile, so that the default profile should be used.
Note that the `my.props.bar` property is set both in `application-main` and `application-main-prod` files, that are both loaded.
Expected: the value from `application-main-prod` should be used
Actual: the value from `application-main` is used
