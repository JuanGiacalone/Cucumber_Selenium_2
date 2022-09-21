const report = require('multiple-cucumber-html-reporter');


/// Activar openreportinbrowser para que se abra el navegador despues de la ejecucion
report.generate({
    jsonDir: './test/report/',
    reportPath: './test/report/',
    openReportInBrowser: true,
    displayDuration: true,
    metadata:{
        browser: {
            name: 'chrome',
            version: '60'
        },
        device: 'Local test machine',
        platform: {
            name: 'ubuntu',
            version: '16.04'
        }
    },

});