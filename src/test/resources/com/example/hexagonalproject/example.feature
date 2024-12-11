Feature:

  Background:
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:8080')


  Scenario Outline:
    # check the get endpoint with id ${id} iterating itself with outline
    * url `${urlBase}/kotlin/example/${id}`
    * method get
    * status 200
    * response.id = id * 1
    * response.desc = desc
    * assert responseTime < 1000
    * print responseTime
    * match response.id == '#number'
    * match response.desc == '#string'
    Examples:
      | id | desc  |
      | 5  | This is a sample entry 5 |
      | 6  | This is a sample entry 6|


  Scenario Outline:
    # from csv
    * url `${urlBase}/kotlin/example/${id}`
    * method get
    * status 200
    * response.id = id * 1
    * response.desc = desc
    * assert responseTime < 1000
    * print responseTime
    * match response.id == '#number'
    * match response.desc == '#string'
    Examples:
      | read('test-data.csv') |


  Scenario:
    * table data
      | id | desc  |
      | 6  | 'This is a sample entry 6' |
      | 7  | 'This is a sample entry 7' |
    * call read('@called') data


  @ignore @called
  Scenario: check get example with id
    # check the get endpoint with id 6
    * url `${urlBase}/kotlin/example/${id}`
    * method get
    * status 200
    * assert responseHeaders['Content-Type'] == 'application/json'
    * match responseHeaders['Content-Type'] == ['application/json']
    * match responseHeaders['Content-Type'] contains 'application/json'
    * print responseHeaders
    # forma 1
    * match response ==
      """
      {
        "id" : '#(id)',
        "desc": "#(desc)"
      }
      """
    # forma 2
    * match response == { id: "#(id)", desc: "#(desc)"}
    # forma 3
    * response.id = id
    * response.desc = desc
    * assert responseTime < 100
    * print responseTime
    * match response.id == '#number'
    * match response.desc == '#string'


#    Scenario Outline:
#    # a post
#    * url `${urlBase}/kotlin/example/add`
#    * request { id: 13, desc: 'no importa' }
#    * method post
#    * status 200
#    * match response == { id: 13, desc: 'Esto es la descripcion' }

