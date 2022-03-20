import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

class Solution {
  public int[] solution(String[] genres, int[] plays) {    
    Map<String, Integer> genreToTotalPlay = new HashMap<>();
    Map<String, PriorityQueue<Song>> genreToSongs = new HashMap<>();
    
    for (int i = 0; i < genres.length; i++) {
      String genre = genres[i];
      int play = plays[i];
      
      genreToTotalPlay.put(genre, genreToTotalPlay.getOrDefault(genre, 0) + play);
      if (!genreToSongs.containsKey(genre)) {
        genreToSongs.put(genre, new PriorityQueue<>((s1, s2) -> s2.play - s1.play));
      }
      genreToSongs.get(genre).add(new Song(i, play));
    }
    
    List<Map.Entry<String, Integer>> list = new LinkedList<>(genreToTotalPlay.entrySet());
    list.sort((e1, e2) -> e2.getValue() - e1.getValue());
    
    List<Integer> answerList = new LinkedList<>();
    
    for (Map.Entry<String, Integer> l : list) {
      PriorityQueue<Song> tmp = genreToSongs.get(l.getKey());
      for (int i = 0; !tmp.isEmpty() && i < 2; i++) {
        answerList.add(tmp.poll().order);
      }
    }
    
    int[] answer = new int[answerList.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = answerList.get(i);
    }
    return answer;
  }
}

class Song {
  int order;
  int play;
  
  Song(int order, int play) {
    this.order = order;
    this.play = play;
  }
}