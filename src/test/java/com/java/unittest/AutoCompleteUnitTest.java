//package com.java.unittest;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@SpringBootTest
//public class AutoCompleteUnitTest {
//
//    private class AutoCompleteDomain implements Comparable<AutoCompleteDomain> {
//
//        private String searchValue;
//
//        private int searchCount = 1; // 1로 초기화
//
//        public AutoCompleteDomain(String searchValue) {
//            this(searchValue, 1);
//        }
//
//        public AutoCompleteDomain(String searchValue, int searchCount) {
//            this.searchValue = searchValue;
//            this.searchCount = searchCount;
//        }
//
//        public String getSearchValue() {
//            return searchValue;
//        }
//
//        public int getSearchCount() {
//            return searchCount;
//        }
//
//        public void setSearchValue(String searchValue) {
//            this.searchValue = searchValue;
//        }
//
//        public void setSearchCount(int searchCount) {
//            this.searchCount = searchCount;
//        }
//
//        @Override
//        public String toString() {
//            return "AutoCompleteDomain{" +
//                    "searchValue='" + searchValue + '\'' +
//                    ", searchCount=" + searchCount +
//                    '}';
//        }
//
//        @Override
//        public int compareTo(AutoCompleteDomain o) {
//            if (this.searchCount < o.getSearchCount()) {
//                return 1;
//            }
//            return 0;
//        }
//    }
//
//        @Test
//        public void autoComplete() {
//            String prevAutoComplete = "yck,msm,cyh,cbk,ycm,yck";
//            String currentAutoComplete = "yc";
//            List<AutoCompleteDomain> autoCompleteList = this.autoCompleteList(prevAutoComplete, currentAutoComplete);
//            autoCompleteList = autoCompleteList.stream()
//                    .filter(x -> x.getSearchValue().startsWith(currentAutoComplete)).collect(Collectors.toList());
//            for (AutoCompleteDomain acd : autoCompleteList) {
//                System.out.println(acd.getSearchValue());
//            }
//        }
//
//        // 중복일 경우에는 해당 도메인 오브젝트에 +1 연산 중복이 아닐 경우에는 배열에 삼입 처리
//        private List<AutoCompleteDomain> autoCompleteList(String prevAutoComplete, String currentAutoComplete) {
//            List<AutoCompleteDomain> completeList = new ArrayList<AutoCompleteDomain>();
//            String[] splitAutoComplete = prevAutoComplete.split(",");
//            for (String completeStr : splitAutoComplete) {
//                String autoCompleteStr = completeStr.trim();
//                AutoCompleteDomain acd = completeList.stream()
//                        .filter(o -> autoCompleteStr.equals(o.getSearchValue())).findAny().orElse(null);
//            }
//            Collections.sort(completeList);
//            return completeList;
//        }
//    }
