Feature:

  Background:
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:8080')

  Scenario: check endpoints
    # check the get endpoint
    * url `${urlBase}/kotlin/example/6`
    * method get
    * status 200
    * match response == { id: 6, desc: 'Esto es la descripcion'}
    * def id1 = response.id
    * def desc1 = response.desc

    # commt
    * method get
    * status 200
    * match response contains { id: '#(id1)', desc: '#(desc1)'}

    # check the get endpoint
    * url `${urlBase}/kotlin/example/8`
    * method get
    * status 200
    * match response == { id: 8, desc: 'Esto es la descripcion'}
    * def id2 = response.id
    * def desc2 = response.desc

    # commt
    * method get
    * status 200
    * match response contains { id: '#(id2)', desc: '#(desc2)'}
