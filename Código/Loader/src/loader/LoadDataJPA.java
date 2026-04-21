package loader;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Institutions;
import entities.Publications;
import entities.Researchers;
import entities.SkillsAndExpertise;


public class LoadDataJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();

		Institutions iNew1 = new Institutions("Federal University Otuoke", "Bayelsa-Nigeria", "Biochemistry", null);
		Institutions iNew2 = new Institutions("University of Technology Sydney", "Sydney, NSW, Australia", "UTS · Advanced Analytics Institute (AAI)", null);
		Institutions iNew3 = new Institutions("LUISS Guido Carli, Libera Università Internazionale degli Studi Sociali", "Rome, Italy", "Luiss · Department of Business and Management", null);

		SkillsAndExpertise proteins = new SkillsAndExpertise("Proteins", null);
		SkillsAndExpertise chromatography = new SkillsAndExpertise("Chromatography", null);
		SkillsAndExpertise proteinPurification = new SkillsAndExpertise("Protein Purification", null);
		SkillsAndExpertise enzymes = new SkillsAndExpertise("Enzymes", null);
		SkillsAndExpertise enzymeActivity = new SkillsAndExpertise("Enzyme Activity", null);
		SkillsAndExpertise proteinCharacterization = new SkillsAndExpertise("Protein Characterization", null);
		SkillsAndExpertise proteinBiochemistry = new SkillsAndExpertise("Protein Biochemistry", null);
		SkillsAndExpertise proteinExpression = new SkillsAndExpertise("Protein Expression", null);
		SkillsAndExpertise proteinStructure = new SkillsAndExpertise("Protein Structure", null);
		SkillsAndExpertise biochemistry = new SkillsAndExpertise("Biochemistry", null);
		SkillsAndExpertise informationAndCommunicationTechnology = new SkillsAndExpertise("Information and Communication Technology", null);
		SkillsAndExpertise informationTechnology = new SkillsAndExpertise("Information Technology", null);
		SkillsAndExpertise recommenderSystems = new SkillsAndExpertise("Recommender Systems", null);
		SkillsAndExpertise informationSystemManagement = new SkillsAndExpertise("Information System Management", null);
		SkillsAndExpertise informationManagement = new SkillsAndExpertise("Information Management", null);
		SkillsAndExpertise algorithms = new SkillsAndExpertise("Algorithms", null);
		SkillsAndExpertise machineLearning = new SkillsAndExpertise("Machine Learning", null);
		SkillsAndExpertise dataMiningAndKnowledgeDiscovery = new SkillsAndExpertise("Data Mining and Knowledge Discovery", null);
		SkillsAndExpertise computationalIntelligence = new SkillsAndExpertise("Computational Intelligence", null);
		SkillsAndExpertise dataMining = new SkillsAndExpertise("Data Mining", null);
		SkillsAndExpertise artificialIntelligence = new SkillsAndExpertise("Artificial Intelligence", null);
		SkillsAndExpertise associationRuleMining = new SkillsAndExpertise("Association Rule Mining", null);
		SkillsAndExpertise clustering = new SkillsAndExpertise("Clustering", null);
		SkillsAndExpertise classification = new SkillsAndExpertise("Classification", null);
		SkillsAndExpertise mining = new SkillsAndExpertise("Mining", null);
		SkillsAndExpertise patternRecognition = new SkillsAndExpertise("Pattern Recognition", null);
		SkillsAndExpertise network = new SkillsAndExpertise("Network", null);
		SkillsAndExpertise outsourcing = new SkillsAndExpertise("Outsourcing", null);
		SkillsAndExpertise microsoftWindows = new SkillsAndExpertise("Microsoft Windows", null);
		SkillsAndExpertise environment = new SkillsAndExpertise("Environment", null);
		SkillsAndExpertise entrepreneurship = new SkillsAndExpertise("Entrepreneurship", null);
		SkillsAndExpertise institutions = new SkillsAndExpertise("Institutions", null);
		SkillsAndExpertise corporateStrategy = new SkillsAndExpertise("Corporate Strategy", null);
		
		Date dat = new Date();
		dat = new Date(114, 0, 1);
		Publications pNew1 = new Publications(1, "Changes in Haematological Parameters Following the Administration of Crude Extract from Tympanotonus fuscatus (Periwinkle) in Rats", dat, "", "Australian Journal of Basic and Applied Sciences", "Changes in haematogical parameters following the administration of crude extract from Tympanotonus fuscatus (Periwinkle) in rats", "Australian Journal of Basic and Applied Sciences', 'Changes in haematogical parameters following the administration of crude extract from Tympanotonus fuscatus (Periwinkle) in rats', 'Background:  The  consumption  of  Periwinkle  (Tympanotonus  fuscatus)  in  various meals in Nigeria is on the increase. It is important to ascertain the effects of the various components of our  everyday meal  on the  body functions. Objective: This study was embarked  upon  to  investigate  the  effect  of  crude  extract  from  Periwinkle (Tympanotonus  fuscatus)  on  haematological  parameters.  Results:  The  graded concentrations of the extract (2.82 - 180.48mgProtein/kg) were administered i.p. to the rats to determine the LD50 value of the extract as preliminary studies. Eighteen albino wistar rats  weighing 180  - 240  g were randomly assigned into 3 groups (n = 6), thus; control, low (7mgProtein/ml) and high (52mgProtein/ml) doses extract treated groups. All animals had free access to drinking water and  normal rat feed for 6 weeks.  The result showed  that the extract had a protein content of 10.12 ±  0.00mgProtein/ml and LD50 values of 61.48mgProtein/ml. Both the low and high doses produced significant increase in  RBC count  (p<0.001) compared  with control. The extract treated  groups also had significant increase in Hb (p<0.001), PCV (P<0.001), MCH (p<0.001), MCHC (p<0.001) and WBC counts (p<0.001). The results also showed that the extract treated groups  had increased  platelet count  (p<0.001), but  decreased  mean  platelet  volume (p<0.001), platelet distribution width (p<0.001) and platelet large cell ratio (p<0.001). Conclusion: The  edible molluscan  sea food (Periwinkle) probably contains accessory nutrients that enhance blood cells production  and reduction in  platelet indices in  rats. They could therefore serve as alternative source of nutrient", null);
		dat = new Date(88, 2, 1);
		Publications pNew2 = new Publications(2, "The effects of oral and intraperitoneal administration of ethanol on the activities of hepatic glucose-6-phosphate and 6-phosphogluconate dehydrogenases in rats", dat, "10.1016/0741-8329(88)90007-9", "PubMed", "Changes in haematogical parameters following the administration of crude extract from Tympanotonus fuscatus (Periwinkle) in rats", "The activities of hepatic glucose-6-phosphate and 6-phosphogluconate dehydrogenases decreased significantly only in male rats, when rats of both sexes were fed a 2% sucrose solution containing 25% ethanol for six weeks. Sucrose (2%) activation of these enzymes was significant only in female rats. The daily administration of ethanol (5 g/kg body wt.) by intraperitoneal injection for two weeks significantly decreased the activities of these enzymes and eliminated the sex differences in the response to ethanol ingestion.", null);
		dat = new Date(85, 9, 1);
		Publications pNew3 = new Publications(3, "Immobilization of chicken liver fructose 1,6-bisphosphatase on CNBr-activated Sepharose", dat, "10.1007/BF01951702", "PubMed", "", "Chicken liver fructose 1,6-bisphosphatase is readily immobilized on CNBr-activated Sepharose. The immobilization alters some enzymatic properties. They include broader pH activity curve, loss of activation by K+ or NH 4+, increased resistance to inactivation by trypsin, decreased sensitivity to AMP inhibition, and loss of cooperative interaction among AMP-binding sites. The immobilized enzyme retains about 38% or 19% of the specific activity of the native enzyme when the activity is measured in the absence or presence of K+, resepctively.", null);
		dat = new Date(83, 11, 1);
		Publications pNew4 = new Publications(4, "Synergistic effect of AMP and fructose 2,6-bisphosphate on the protection of fructose 1,6-bisphosphatase against inactivation by trypsin", dat, "10.1007/BF01990383", "PubMed", "", "The rate of inactivation of chicken liver fructose 1,6-bisphosphatase by trypsin is reduced if the digestive reaction is conducted in the presence of AMP or fructose 2,6-bisphosphate. The effects of these 2 compounds are synergistic. Although fructose 1,6-bisphosphate does not protect the enzyme against tryptic inactivation, it can enhance the effect of AMP. Selective modification of the AMP allosteric site of fructose 1,6-bisphosphatase with pyridoxal-P and NaBH4 renders the enzyme more resistant to tryptic inactivation, but the modified enzyme is no longer responsive to the protective effect of AMP.", null);
		dat = new Date(82, 1, 1);
		Publications pNew5 = new Publications(5, "Fructose-1,6-bisphosphatase from Turkey liver", dat, "10.1016/S0076-6879(82)90151-3", "PubMed", "", "This chapter describes an assay method and the purification procedure for fructose-1,6-bisphosphatase from turkey liver. Turkey liver FBPase can be satisfactorily isolated from freshly removed livers or frozen livers. For the assay of fructose-l,6-bisphosphatase (FBPase), the formation of fructose 6-phosphate is measured spectrophotometrically by following the reduction of NADP at 340 nm in a coupled reaction containing excess of phosphoglucose isomerase and glucose-6-phosphate dehydrogenase. The purification process involves preparation of crude extract, heat treatment, removal of unwanted proteins by phosphocellulose, phosphocellulose absorption and chromatography, and Blue Sepharose chromatography. The molecular weight of the enzyme is approximately 144,000, as calculated by sedimentation analysis in a sucrose density gradient. Without chelating agents, the enzyme has optimum activity at pH 8.4–8.5 and this enzyme requires divalent cations (Mg2+ or Mn2+) for activity. Turkey liver FBPase can be readily immobilized on CNBr-activated Sepharose 4B.", null);
		
		
		dat = new Date(120, 8, 1);
		Publications pNew6 = new Publications(6, "The Era of Intelligent Recommendation: Editorial on Intelligent Recommendation with Advanced AI and Learning", dat, "", "IEEE Intelligent Systems", "Session-based Recommender Systems", "", null);
		dat = new Date(120, 8, 1);
		Publications pNew7 = new Publications(7, "Double-Wing Mixture of Experts for Streaming Recommendations", dat, "", "", "", "Streaming Recommender Systems (SRSs) commonly train recommendation models on newly received data only to address user preference drift, i.e., the changing user preferences towards items. However, this practice overlooks the long-term user preferences embedded in historical data. More importantly, the common heterogeneity in data stream greatly reduces the accuracy of streaming recommendations. The reason is that different preferences (or characteristics) of different types of users (or items) cannot be well learned by a unified model. To address these two issues, we propose a Variational and Reservoir-enhanced Sampling based Double-Wing Mixture of Experts framework, called VRS-DWMoE, to improve the accuracy of streaming recommendations. In VRS-DWMoE, we first devise variational and reservoir-enhanced sampling to wisely complement new data with historical data, and thus address the user preference drift issue while capturing long-term user preferences. After that, we propose a Double-Wing Mixture of Experts (DWMoE) model to first effectively learn heterogeneous user preferences and item characteristics, and then make recommendations based on them. Specifically, DWMoE contains two Mixture of Experts (MoE, an effective ensemble learning model) to learn user preferences and item characteristics, respectively. Moreover, the multiple experts in each MoE learn the preferences (or characteristics) of different types of users (or items) where each expert specializes in one underlying type. Extensive experiments demonstrate that VRS-DWMoE consistently outperforms the state-of-the-art SRSs.", null);
		dat = new Date(120, 8, 1);
		Publications pNew8 = new Publications(8, "Stratified and Time-aware Sampling based Adaptive Ensemble Learning for Streaming Recommendations", dat, "", "", "", "Recommender systems have played an increasingly important role in providing users with tailored suggestions based on their preferences. However, the conventional offline recommender systems cannot handle the ubiquitous data stream well. To address this issue, Streaming Recommender Systems (SRSs) have emerged in recent years, which incrementally train recommendation models on newly received data for effective real-time recommendations. Focusing on new data only benefits addressing concept drift, i.e., the changing user preferences towards items. However, it impedes capturing long-term user preferences. In addition, the commonly existing underload and overload problems should be well tackled for higher accuracy of streaming recommendations. To address these problems, we propose a Stratified and Time-aware Sampling based Adaptive Ensemble Learning framework, called STS-AEL, to improve the accuracy of streaming recommendations. In STS-AEL, we first devise stratified and time-aware sampling to extract representative data from both new data and historical data to address concept drift while capturing long-term user preferences. Also, incorporating the historical data benefits utilizing the idle resources in the underload scenario more effectively. After that, we propose adaptive ensemble learning to efficiently process the overloaded data in parallel with multiple individual recommendation models, and then effectively fuse the results of these models with a sequential adaptive mechanism. Extensive experiments conducted on three real-world datasets demonstrate that STS-AEL, in all the cases, significantly outperforms the state-of-the-art SRSs.", null);
		dat = new Date(120, 8, 1);
		Publications pNew9 = new Publications(9, "Concept Representation by Learning Explicit and Implicit Concept Couplings", dat, "10.1109/MIS.2020.3021188", "Intelligent Systems, IEEE", "", "Generating the precise semantic representation of a word/concept is a fundamental task in natural language processing. Recent studies which incorporate semantic knowledge into word embedding have shown their potential in improving the semantic representation of a concept. However, existing approaches only achieved limited performance improvement as they usually (1) model a word\\'s semantics from some explicit aspects while ignoring the intrinsic aspects of the word, (2) treat semantic knowledge as a supplement of word embeddings, and (3) consider partial relations between concepts while ignoring rich coupling relations between them, such as explicit concept co-occurrences in descriptive texts in a corpus as well as concept hyperlink relations in a knowledge network, and implicit couplings between the explicit relations. In human consciousness, concepts are associated with various coupling relations, which inspires us to capture as many concept couplings as possible for building a better concept representation. We thus propose a neural coupled concept representation (CoupledCR) framework and its instantiation: a coupled concept embedding (CCE) model. CCE first learns two types of explicit couplings from concept cooccurrences and hyperlink relations respectively, and then learns a type of high-level implicit couplings between these two types of explicit couplings. Extensive experimental results on real-world datasets show that CCE significantly outperforms state-of-the-art semantic representation methods.", null);
		dat = new Date(120, 6, 1);
		Publications pNew10 = new Publications(10, "Intention2Basket: A Neural Intention-driven Approach for Dynamic Next-basket Planning", dat, "10.24963/ijcai.2020/319", "", "Session-based Recommender Systems", "User purchase behaviours are complex and dynamic, which are usually observed as multiple choice actions across a sequence of shopping baskets. Most of the existing next-basket prediction approaches model user actions as homogeneous sequence data without considering complex and heterogeneous user intentions, impeding deep under-standing of user behaviours from the perspective of human inside drivers and thus reducing the prediction performance. Psychological theories have indicated that user actions are essentially driven by certain underlying intentions (e.g., diet and entertainment). Moreover, different intentions may influence each other while different choices usually have different utilities to accomplish an intention. Inspired by such psychological insights, we formalize the next-basket prediction as an Intention Recognition, Modelling and Accomplishing problem and further design the Intention2Basket (Int2Ba in short) model. In Int2Ba, an Intention Recognizer, a Coupled Intention Chain Net, and a Dynamic Basket Planner are specifically designed to respectively recognize, model and accomplish the heterogeneous intentions behind a sequence of baskets to better plan the next-basket. Extensive experiments on real-world datasets show the superiority of Int2Ba over the state-of-the-art approaches.", null);
		
		
		dat = new Date(120, 5, 1);
		Publications pNew11 = new Publications(11, "Jointly Modeling Intra- and Inter-transaction Dependencies with Hierarchical Attentive Transaction Embeddings for Next-item Recommendation", dat, "", "", "", "A transaction-based recommender system (TBRS) aims to predict the next item by modeling dependencies in transactional data. Generally, two kinds of dependencies considered are intra-transaction dependency and inter-transaction dependency. Most existing TBRSs recommend next item by only modeling the intra-transaction dependency within the current transaction while ignoring inter-transaction dependency with recent transactions that may also affect the next item. However, as not all recent transactions are relevant to the current and next items, the relevant ones should be identified and prioritized. In this paper, we propose a novel hierarchical attentive transaction embedding (HATE) model to tackle these issues. Specifically, a two-level attention mechanism integrates both item embedding and transaction embedding to build an attentive context representation that incorporates both intraand inter-transaction dependencies. With the learned context representation, HATE then recommends the next item. Experimental evaluations on two real-world transaction datasets show that HATE significantly outperforms the state-ofthe-art methods in terms of recommendation accuracy.", null);
		dat = new Date(120, 3, 1);
		Publications pNew12 = new Publications(12, "Graph Learning Approaches to Recommender Systems: A Review", dat, "", "", "", "Recent years have witnessed the fast development of the emerging topic of Graph Learning based Recommender Systems (GLRS). GLRS mainly employ the advanced graph learning approaches to model users\\' preferences and intentions as well as items\\' characteristics and popularity for Recommender Systems (RS). Differently from conventional RS, including content based filtering and collaborative filtering, GLRS are built on simple or complex graphs where various objects, e.g., users, items, and attributes, are explicitly or implicitly connected. With the rapid development of graph learning, exploring and exploiting homogeneous or heterogeneous relations in graphs is a promising direction for building advanced RS. In this paper, we provide a systematic review of GLRS, on how they obtain the knowledge from graphs to improve the accuracy, reliability and explainability for recommendations. First, we characterize and formalize GLRS, and then summarize and categorize the key challenges in this new research area. Then, we survey the most recent and important developments in the area. Finally, we share some new research directions in this vibrant area.", null);
		dat = new Date(120, 3, 1);
		Publications pNew13 = new Publications(13, "Representation Learning with Multiple Lipschitz-Constrained Alignments on Partially-Labeled Cross-Domain Data", dat, "10.1609/aaai.v34i04.5856", "Proceedings of the AAAI Conference on Artificial Intelligence", "", "The cross-domain representation learning plays an important role in tasks including domain adaptation and transfer learning. However, existing cross-domain representation learning focuses on building one shared space and ignores the unlabeled data in the source domain, which cannot effectively capture the distribution and structure heterogeneities in cross-domain data. To address this challenge, we propose a new cross-domain representation learning approach: MUltiple Lipschitz-constrained AligNments (MULAN) on partially-labeled cross-domain data. MULAN produces two representation spaces: a common representation space to incorporate knowledge from the source domain and a complementary representation space to complement the common representation with target local topological information by Lipschitz-constrained representation transformation. MULAN utilizes both unlabeled and labeled data in the source and target domains to address distribution heterogeneity by Lipschitz-constrained adversarial distribution alignment and structure heterogeneity by cluster assumption-based class alignment while keeping the target local topological information in complementary representation by self alignment. Moreover, MULAN is effectively equipped with a customized learning process and an iterative parameter updating process. MULAN shows its superior performance on partially-labeled semi-supervised domain adaptation and few-shot domain adaptation and outperforms the state-of-the-art visual domain adaptation models by up to 12.1%.", null);
		
		
		dat = new Date(120, 6, 1);
		Publications pNew14 = new Publications(14, "Digitalization in the agri-food industry: the relationship between technology and sustainable development", dat, "10.1108/MD-09-2019-1328", "Management Decision", "", "Purpose Digitalization is becoming the subject of considerable interest in the literature. This is in view of its relevance in addressing social problems and contributing to the development of communities and societies. In the agri-food-industry, digitalization is also expected to contribute significantly to solve several challenges the sector is facing at this moment, such as the increasing food demand and resource use. However, the effects of advanced technologies are less a function of the technologies themselves than of how they are used by people. The study analyses the dominant challenges faced by firms in the agri-food industry in the usage and adoption of digital technology. Also, they show how these challenges impact on the sustainable development of digital technology for firms in the industry and provide avenues for future research. Design/methodology/approach The authors propose a structured literature review aiming to investigate the following research question: what are the main challenges faced by firms within the agri-food industry in the adoption of smart technologies? Findings Results illustrate the dominant challenges faced by firms in the agri-food industry in the usage and adoption of digital technology. Also, they show how these challenges impact on the sustainable development of digital technology for firms in the industry and provide avenues for future research. Originality/value So far, in the context of digitalization in the agri-food industry, various researchers have analysed different kinds of challenges to the adoption of smart technologies. This work reviews these contributions to create a clear reference framework of the challenges faced by agri-food firms while providing future avenues of research and implications at a policymaking, economic-managerial and socio-environmental level.", null);
		dat = new Date(120, 6, 1);
		Publications pNew15 = new Publications(15, "Corrigendum to “Central positions and performance in the scientific community. Evidences from clinical research projects” [J. Bus. Res. 68(5) (2015) 1074–1081]", dat, "10.1016/j.jbusres.2020.04.032", "Journal of Business Research", "", "", null);
		dat = new Date(120, 5, 1);
		Publications pNew16 = new Publications(16, "Faraway, Not So Close: The Conditions That Hindered Knowledge Sharing and Open Innovation in an Online Business Social Network", dat, "10.1109/TEM.2020.2983369", "IEEE Transactions on Engineering Management", "", "This article explains the main mechanisms influencing the knowledge collaboration dynamics occurring across an online business community. Prior research study had conceived firms as autonomous entities competing against each other to reach the competitive advantage. Nonetheless, online business social networks (BSNs) can be seen as networks of organizations that interact within digital structures, providing an optimal locus to foster external knowledge flows, enabling participants to share knowledge across organizational boundaries, and eventually leading to open innovation outcomes. We analyze how virtual networks of business relationships influence the form of knowledge collaboration firms can be engaged in. We analyze the entire three-year collaborative history of a BSN. After a promising launch of the BSN, it declined and failed. By analyzing front- and backstage combined with organizational and technological features of the online business community, we identify and discuss five categories of mechanisms affecting the knowledge collaboration over time and reducing the firms’ uncertainty in exchanging information: first, orchestrators’ skills and competencies in running the online platform; second, internal firm capabilities allocating proper organizational resources; third, usability of the digital platform; four, interconnections between frontstage and backstage combined with technological and organizational features; and fifth, perceived virtual copresence.", null);
		dat = new Date(120, 4, 1);
		Publications pNew17 = new Publications(17, "Cognitive biases and decision-making strategies in times of change: a systematic literature review", dat, "10.1108/MD-07-2019-1006", "Management Decision", "", "Purpose In a work environment marked by unprecedented complexity, volatility and ambiguity, managers must accomplish their objectives while navigating many challenges. This paper aims to investigate potential interrelations among environmental transformations, cognitive biases and strategic decisions. In particular, the purpose of the study is to crystallize the state of art on the impact of cognitive biases on strategic decisions, in the context of environmental transformations. Design/methodology/approach The authors have conducted a systematic literature review to identify existing relevant work on this topic and to detect potential avenues for future research. Findings The findings highlight how decision-making is influenced and enabled by internal (e.g. perception) and external factors (e.g. digitalization). Specifically, the strategic role of cognitive biases appears to be crucial when investigating the related impact on strategic decisions in times of environmental transformation. Practical implications Implications are drawn for scholars and practitioners interested in evaluating the role of specific decision-making determinants for the formation and implementation of strategic decisions. In this sense, we stress that decision-makers need to manage their cognitive biases and select the right information out of a wide data set in order to adapt to environmental transformations. Originality/value By systematizing the literature review, potential interrelations among environmental transformations, cognitive biases and strategic decisions are identified. Furthermore, the primary phases that drive the decision-making process are proposed (analysis, decision, onboarding and control).", null);
		dat = new Date(120, 8, 1);
		Publications pNew18 = new Publications(18, "When birds of a feather dont flock together: Diversity and innovation outcomes in international R&D collaboration.", dat, "10.1016/j.jbusres.2019.08.033", "Journal of Business Research", "", "Collaboration is a key to success. Nonetheless, collaboration dynamics are affected by partner compatibility, which, in turn, is strongly affected by team member diversity. Studies on team diversity have shown significant variation in the magnitude, significance, and causal direction of the correlations. We examine how international R&D teams collaborate, investigating the impact of team diversity on innovation. We focus on institutional diversity to analyze how, together with the duration of the collaboration, it affects innovation outcomes. We argue that institutional diversity hampers effective knowledge sharing and negatively affects innovation outcomes. However, this negative effect is mitigated by the duration of the R&D collaboration. The longer the diverse actors collaborate, the more likely they are to overcome the barriers of institutional diversity and find effective modes of collaboration for knowledge transfer and innovation. We test our hypotheses in the context of 3,658 clinical trial projects conducted between 2001 and 2015.", null);
		
		
		Set<SkillsAndExpertise> skills1 = new HashSet<>();
		skills1.add(proteins);
		skills1.add(chromatography);
		skills1.add(proteinPurification);
		skills1.add(enzymes);
		skills1.add(enzymeActivity);
		skills1.add(proteinCharacterization);
		skills1.add(proteinBiochemistry);
		skills1.add(proteinExpression);
		skills1.add(proteinStructure);
		skills1.add(biochemistry);
		Set<Publications> publications1 = new HashSet<>();
		publications1.add(pNew1);
		publications1.add(pNew2);
		publications1.add(pNew3);
		publications1.add(pNew4);
		publications1.add(pNew5);
		Researchers rNew1 = new Researchers("Joel Johnson", 19, 270, 82, "Federal University Otuoke", skills1, publications1);
		
		Set<SkillsAndExpertise> skills2 = new HashSet<>();
		skills2.add(informationAndCommunicationTechnology);
		skills2.add(informationTechnology);
		skills2.add(recommenderSystems);
		skills2.add(informationSystemManagement);
		skills2.add(informationManagement);
		skills2.add(algorithms);
		Set<Publications> publications2 = new HashSet<>();
		publications2.add(pNew6);
		publications2.add(pNew7);
		publications2.add(pNew8);
		publications2.add(pNew9);
		publications2.add(pNew10);
		publications2.add(pNew11);
		publications2.add(pNew12);
		Researchers rNew2 = new Researchers("Shoujin Wang", 32, 6930, 272, "University of Technology Sydney", skills2, publications2);
		
		Set<SkillsAndExpertise> skills3 = new HashSet<>();
		skills3.add(recommenderSystems);
		skills3.add(machineLearning);
		skills3.add(dataMiningAndKnowledgeDiscovery);
		Set<Publications> publications3 = new HashSet<>();
		publications3.add(pNew6);
		publications3.add(pNew10);
		publications3.add(pNew11);
		publications3.add(pNew12);
		publications3.add(pNew13);
		Researchers rNew3 = new Researchers("Liang Hu", 36, 4091, 419, "University of Technology Sydney", skills3, publications3);
		
		Set<SkillsAndExpertise> skills4 = new HashSet<>();
		skills4.add(computationalIntelligence);
		skills4.add(dataMining);
		skills4.add(artificialIntelligence);
		skills4.add(algorithms);
		skills4.add(associationRuleMining);
		skills4.add(clustering);
		skills4.add(classification);
		skills4.add(mining);
		skills4.add(machineLearning);
		skills4.add(patternRecognition);
		Set<Publications> publications4 = new HashSet<>();
		publications4.add(pNew6);
		publications4.add(pNew10);
		publications4.add(pNew11);
		publications4.add(pNew12);
		publications4.add(pNew13);
		Researchers rNew4 = new Researchers("Longbing Cao", 351, 53222, 5218, "University of Technology Sydney", skills4, publications4);
		
		Set<SkillsAndExpertise> skills5 = new HashSet<>();
		skills5.add(network);
		skills5.add(outsourcing);
		skills5.add(microsoftWindows);
		skills5.add(environment);
		skills5.add(entrepreneurship);
		skills5.add(institutions);
		skills5.add(corporateStrategy);
		Set<Publications> publications5 = new HashSet<>();
		publications5.add(pNew14);
		publications5.add(pNew15);
		publications5.add(pNew16);
		publications5.add(pNew17);
		publications5.add(pNew18);
		Researchers rNew5 = new Researchers("Federica Brunetta", 54, 8059, 86, "LUISS Guido Carli, Libera Università Internazionale degli Studi Sociali", skills5, publications5);
		
		
		em.getTransaction().begin();
		//Institutions
		em.persist(iNew1);
		em.persist(iNew2);
		em.persist(iNew3);
		//Publications
		em.persist(pNew1);
		em.persist(pNew2);
		em.persist(pNew3);
		em.persist(pNew4);
		em.persist(pNew5);
		em.persist(pNew6);
		em.persist(pNew7);
		em.persist(pNew8);
		em.persist(pNew9);
		em.persist(pNew10);
		em.persist(pNew11);
		em.persist(pNew12);
		em.persist(pNew13);
		em.persist(pNew14);
		em.persist(pNew15);
		em.persist(pNew16);
		em.persist(pNew17);
		em.persist(pNew18);
		//Skills
		em.persist(proteins);
		em.persist(chromatography);
		em.persist(proteinPurification);
		em.persist(enzymes);
		em.persist(enzymeActivity);
		em.persist(proteinCharacterization);
		em.persist(proteinBiochemistry);
		em.persist(proteinExpression);
		em.persist(proteinStructure);
		em.persist(biochemistry);
		em.persist(informationAndCommunicationTechnology);
		em.persist(informationTechnology);
		em.persist(recommenderSystems);
		em.persist(informationSystemManagement);
		em.persist(informationManagement);
		em.persist(algorithms);
		em.persist(machineLearning);
		em.persist(dataMiningAndKnowledgeDiscovery);
		em.persist(computationalIntelligence);
		em.persist(dataMining);
		em.persist(artificialIntelligence);
		em.persist(associationRuleMining);
		em.persist(clustering);
		em.persist(classification);
		em.persist(mining);
		em.persist(patternRecognition);
		em.persist(network);
		em.persist(outsourcing);
		em.persist(microsoftWindows);
		em.persist(environment);
		em.persist(entrepreneurship);
		em.persist(institutions);
		em.persist(corporateStrategy);
		//Researchers
		em.persist(rNew1);
		em.persist(rNew2);
		em.persist(rNew3);
		em.persist(rNew4);
		em.persist(rNew5);
		em.getTransaction().commit();
	
		System.out.println("END");
		
		// Close an application-managed entity manager.
		em.close();
		// Close the factory, releasing any resources that it holds.
		emf.close();
	}

}
