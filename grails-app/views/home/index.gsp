<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Pilot Aid</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to Grails</h1>

            <p>
                Congratulations, you have successfully started your first Grails application! At the moment
                this is the default page, feel free to modify it to either redirect to a controller or display
                whatever content you may choose. Below is a list of controllers that are currently deployed in
                this application, click on each to execute its default action:
            </p>

            <div id="controllers" role="navigation">
                <h2>Available Controllers:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            <h2>Application Status:</h2>
            <ul style="list-style: none;">
                <li>Environment: ${grails.util.Environment.current.name}</li>
                <li>App profile: ${grailsApplication.config.grails?.profile}</li>
                <li>App version:
                    <g:meta name="info.app.version"/>
                </li>
                <li role="separator" class="divider"></li>
                <li>Grails version:
                    <g:meta name="info.app.grailsVersion"/>
                </li>
                <li>Groovy version: ${GroovySystem.getVersion()}</li>
                <li>JVM version: ${System.getProperty('java.version')}</li>
                <li role="separator" class="divider"></li>
                <li>Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</li>
            </ul>
            <h2>Artefacts</h2>
            <ul style="list-style: none;">
                <li>Controllers: ${grailsApplication.controllerClasses.size()}</li>
                <li>Domains: ${grailsApplication.domainClasses.size()}</li>
                <li>Services: ${grailsApplication.serviceClasses.size()}</li>
                <li>Tag Libraries: ${grailsApplication.tagLibClasses.size()}</li>
            </ul>
            <h2>Installed Plugins</h2>
            <ul style="list-style: none;">
                <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                    <li>${plugin.name} - ${plugin.version}</li>
                </g:each>
            </ul>
            </div>
        </section>
    </div>

</body>
</html>
