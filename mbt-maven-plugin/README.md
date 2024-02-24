# Usage Examples

## Batch-Job and Plug-In examples

### Vertex

When modelled as a graph, the **vertex** are **file** objects.

Object details are **fragment** or **snippet**. 

Example endings
* The Input.txt file isn't empty
* The Input.txt file is invalid

### Edge

When modelled as a graph, the **edge** are **job** or **goal** objects.

Edges are **executed** (manually) or **triggered** (automatically on a schedule). Input parameters are specified using **with** (goal tags or batch job parameters)

Example endings
* The do-it goal is executed with
* The nightly job will be triggered
* The nightly job won't be triggered


## Web-App and Web-Service examples

### Vertex

When modelled as a graph, the **vertex** are **page** or **response** objects.

Object details are **section** or **table**. 

Example endings
* The Home page top section will be present
* The Home page search button won't be enabled

### Edge

When modelled as a graph, the **edge** are **request objects.

Edges are **sent** (by browser or client) or **triggered** (automatically on a schedule). Input parameters are specified using **as follows** (request parameters)

Example endings
* The log-in request isn't sent (on time, then files are deleted)