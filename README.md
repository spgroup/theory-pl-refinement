# A Theory of Software Product Line Refinement

This repository contains the PVS specification files for the theory of Software Product Line Refinement and Partial Refinement. 

The Partial Refinement theories are built on the Refinement theories and start with <b>Partial</b>. 

In the Documentation folder, you can find a summary of the theories and also information regarding templates. 

![alt tag](https://github.com/spgroup/theory-pl-refinement/blob/dev/Documentation/theory-structure.pdf)

## Experiment

To run the experiment, the following steps are necessary:
- Clone project repositories. Linux and Soletta are available at: https://github.com/torvalds/linux/ and https://github.com/solettaproject/soletta/, respectively.
- Download and setup FEVER, which is available at https://github.com/NZR/SPLR-FEVER-Tool/tree/master/fever. Please follow the instructions specified in the FEVER repository.
- Inform FEVER the repository and commits/versions to be analyzed. In our experiment, we analyzed versions 3.11 to 3.16 from Linux and versions v1_beta0 to v1_beta18 from Soletta. The databases generated by FEVER for these versions are available in the EmpiricalStudy folder. 
- After generating the Neo4j database for the specific versions/commits, it is necessary to query the database to find patterns. All queries used in our experiment are also available in the Queries.pdf file in the EmpiricalStudy folder.

We also make available the Java program used to create txt files with the commit messages in the EmpiricalStudy folder. To use it, you should first download a JSON file in Neo4j containing the querie result. Then, our script creates a .txt file for each message, so that they can be used later by a natural language tool such as Lucene (http://lucene.apache.org/).
You can also find the Lucene jar file used, but you can check their website for latest versions if preferred.

If you have any further questions, please contact Gabriela Sampaio (gcs@cin.ufpe.br) or Leopoldo Teixeira (lmt@cin.ufpe.br)
