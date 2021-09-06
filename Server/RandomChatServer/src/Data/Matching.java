//package Data;
//
//import Network.SocketManager;
//import Util.Debug;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class Matching implements Runnable {
//    MatchingCondition matchingCondition;
//    Client sourceClient;
//    Client targetClient ;
//
//    public Matching(Client sourceClient, MatchingCondition matchingCondition) {
//        this.sourceClient = sourceClient;
//        this.sourceClient.status = Client.MATCHING;
//        this.matchingCondition = matchingCondition;
//    }
//
//    @Override
//    public void run() {
//        while (targetClient == null) {
//            try {
//                match();
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//    }
//
//    private void match() {
//        randomMatching();
//
//        // availableClients = getAvailableClients();
//        // if(matchingCondition.condition.equals("random")){
//        // randomMatching();
//        // }
//        // else if(matchingCondition.condition.equals("premium")){
//        // premiumMatching(matchingCondition);
//        // }
//    }
//
//    private ArrayList getAvailableClients(MatchingCondition mc) {
//        ArrayList<Client> clients = SocketManager.getInstance().clients;
//
//        for (int i = 0; i < clients.size(); i++) {
//            User user = clients.get(i).user;
//
//            if (user.getAge() >= mc.minAge && user.getAge() <= mc.maxAge) {
//
//            }
//        }
//        return clients;
//    }
//
//    private void randomMatching() {
//        //mc.remove(mc.indexOf(sourceClient));
//        //클라이언트 전부에서 삭제?  오류
//        
//        Collections.shuffle(availableClients);
//        
//        if (sourceClient != targetClient) {
//            
//            sourceClient.status = 2;
//            
//            while(true){
//                if(sourceClient == availableClients.get(0)){
//                    Collections.shuffle(availableClients);
//                }
//                else if(sourceClient != availableClients.get(0)){
//                    targetClient = availableClients.get(0);
//                    //targetClient의 targetClient = sourceClient 어케하노
//                    //targetClient가 client에 가면?
//                    break;
//                }
//            }
//            
//            targetClient.status = 2;
//            
//            Debug.log("source Client : " + sourceClient.getUser());
//            Debug.log("target Client : " + targetClient.getUser());
//            
//        }
//    }
//
//    private void conditionCheck(String message, ArrayList<Client> availableClients, ArrayList<Client> primeumClients) {
//        try {
//            for (int i = 0; i < availableClients.size(); i++) {
//                // // matchingClients[i]의 정보가 너무 길어서 짧게 쓸려고 변수 선언
//                // int ageFilter = availableClients.get(i).user.getAge();
//                // String genderFilter = availableClients.get(i).user.getGender();
//                // // 조건값에 '상관없음'이 들어갔을 경우 true로 만들어줌
//                // if (availableClients.getAge() >= matchingCondition.minAge)
//                // //this.minAger <= mathcingCondition.minage
//                // condition[1] = Integer.toString(ageFilter);
//                // else if (condition[3].equals(""))
//                // condition[3] = genderFilter;
//                // // 조건 만족 시 프리미엄 배열에 추가
//                // if (((ageFilter >= min) && (ageFilter <= max)) &&
//                // (condition[3].equals(genderFilter))) {
//                //
//                // for (int j = 0; j < primeumClients.size(); j++) {
//                // if (primeumClients.get(j) == null) {
//                // primeumClients.set(j, availableClients.get(i));
//                // } else
//                // primeumClients.add(availableClients.get(i));
//                // }
//                // }
//            }
//            User user = new User();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void printClients() {
//        SocketManager.getInstance().printClients();
//    }
//
//}
