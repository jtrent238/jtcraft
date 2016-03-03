/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ad
/*     */ {
/*  19 */   private static final Pattern a = Pattern.compile("^@([parf])(?:\\[([\\w=,!-]*)\\])?$");
/*  20 */   private static final Pattern b = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
/*  21 */   private static final Pattern c = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static mw a(ac paramac, String paramString)
/*     */   {
/*  44 */     mw[] arrayOfmw = c(paramac, paramString);
/*     */     
/*  46 */     if ((arrayOfmw == null) || (arrayOfmw.length != 1)) { return null;
/*     */     }
/*  48 */     return arrayOfmw[0];
/*     */   }
/*     */   
/*     */   public static fj b(ac paramac, String paramString) {
/*  52 */     mw[] arrayOfmw = c(paramac, paramString);
/*  53 */     if ((arrayOfmw == null) || (arrayOfmw.length == 0)) return null;
/*  54 */     fj[] arrayOffj = new fj[arrayOfmw.length];
/*     */     
/*  56 */     for (int i = 0; i < arrayOffj.length; i++) {
/*  57 */       arrayOffj[i] = arrayOfmw[i].c_();
/*     */     }
/*     */     
/*  60 */     return y.a(arrayOffj);
/*     */   }
/*     */   
/*     */   public static mw[] c(ac paramac, String paramString) {
/*  64 */     Matcher localMatcher = a.matcher(paramString);
/*     */     
/*  66 */     if (localMatcher.matches()) {
/*  67 */       Map localMap1 = h(localMatcher.group(2));
/*  68 */       String str1 = localMatcher.group(1);
/*  69 */       int i = c(str1);
/*  70 */       int j = d(str1);
/*  71 */       int k = f(str1);
/*  72 */       int m = e(str1);
/*  73 */       int n = g(str1);
/*  74 */       int i1 = ahk.a.a();
/*  75 */       r localr = paramac.f_();
/*  76 */       Map localMap2 = a(localMap1);
/*  77 */       String str2 = null;
/*  78 */       String str3 = null;
/*  79 */       int i2 = 0;
/*     */       
/*  81 */       if (localMap1.containsKey("rm")) {
/*  82 */         i = qh.a((String)localMap1.get("rm"), i);
/*  83 */         i2 = 1;
/*     */       }
/*  85 */       if (localMap1.containsKey("r")) {
/*  86 */         j = qh.a((String)localMap1.get("r"), j);
/*  87 */         i2 = 1;
/*     */       }
/*  89 */       if (localMap1.containsKey("lm")) {
/*  90 */         k = qh.a((String)localMap1.get("lm"), k);
/*     */       }
/*  92 */       if (localMap1.containsKey("l")) {
/*  93 */         m = qh.a((String)localMap1.get("l"), m);
/*     */       }
/*  95 */       if (localMap1.containsKey("x")) {
/*  96 */         localr.a = qh.a((String)localMap1.get("x"), localr.a);
/*  97 */         i2 = 1;
/*     */       }
/*  99 */       if (localMap1.containsKey("y")) {
/* 100 */         localr.b = qh.a((String)localMap1.get("y"), localr.b);
/* 101 */         i2 = 1;
/*     */       }
/* 103 */       if (localMap1.containsKey("z")) {
/* 104 */         localr.c = qh.a((String)localMap1.get("z"), localr.c);
/* 105 */         i2 = 1;
/*     */       }
/* 107 */       if (localMap1.containsKey("m")) {
/* 108 */         i1 = qh.a((String)localMap1.get("m"), i1);
/*     */       }
/* 110 */       if (localMap1.containsKey("c")) {
/* 111 */         n = qh.a((String)localMap1.get("c"), n);
/*     */       }
/* 113 */       if (localMap1.containsKey("team")) {
/* 114 */         str3 = (String)localMap1.get("team");
/*     */       }
/* 116 */       if (localMap1.containsKey("name")) {
/* 117 */         str2 = (String)localMap1.get("name");
/*     */       }
/*     */       
/* 120 */       ahb localahb = i2 != 0 ? paramac.d() : null;
/*     */       List localList;
/* 122 */       if ((str1.equals("p")) || (str1.equals("a"))) {
/* 123 */         localList = MinecraftServer.I().ah().a(localr, i, j, n, i1, k, m, localMap2, str2, str3, localahb);
/* 124 */         return localList.isEmpty() ? new mw[0] : (mw[])localList.toArray(new mw[localList.size()]); }
/* 125 */       if (str1.equals("r")) {
/* 126 */         localList = MinecraftServer.I().ah().a(localr, i, j, 0, i1, k, m, localMap2, str2, str3, localahb);
/* 127 */         Collections.shuffle(localList);
/* 128 */         localList = localList.subList(0, Math.min(n, localList.size()));
/* 129 */         return localList.isEmpty() ? new mw[0] : (mw[])localList.toArray(new mw[localList.size()]);
/*     */       }
/* 131 */       return null;
/*     */     }
/*     */     
/* 134 */     return null;
/*     */   }
/*     */   
/*     */   public static Map a(Map paramMap)
/*     */   {
/* 139 */     HashMap localHashMap = new HashMap();
/*     */     
/* 141 */     for (String str1 : paramMap.keySet()) {
/* 142 */       if ((str1.startsWith("score_")) && (str1.length() > "score_".length())) {
/* 143 */         String str2 = str1.substring("score_".length());
/* 144 */         localHashMap.put(str2, Integer.valueOf(qh.a((String)paramMap.get(str1), 1)));
/*     */       }
/*     */     }
/*     */     
/* 148 */     return localHashMap;
/*     */   }
/*     */   
/*     */   public static boolean a(String paramString) {
/* 152 */     Matcher localMatcher = a.matcher(paramString);
/*     */     
/* 154 */     if (localMatcher.matches()) {
/* 155 */       Map localMap = h(localMatcher.group(2));
/* 156 */       String str = localMatcher.group(1);
/* 157 */       int i = g(str);
/* 158 */       if (localMap.containsKey("c")) i = qh.a((String)localMap.get("c"), i);
/* 159 */       return i != 1;
/*     */     }
/*     */     
/* 162 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(String paramString1, String paramString2) {
/* 166 */     Matcher localMatcher = a.matcher(paramString1);
/*     */     
/* 168 */     if (localMatcher.matches()) {
/* 169 */       String str = localMatcher.group(1);
/* 170 */       if ((paramString2 != null) && (!paramString2.equals(str))) { return false;
/*     */       }
/* 172 */       return true;
/*     */     }
/*     */     
/* 175 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean b(String paramString) {
/* 179 */     return a(paramString, null);
/*     */   }
/*     */   
/*     */   private static final int c(String paramString) {
/* 183 */     return 0;
/*     */   }
/*     */   
/*     */   private static final int d(String paramString) {
/* 187 */     return 0;
/*     */   }
/*     */   
/*     */   private static final int e(String paramString) {
/* 191 */     return Integer.MAX_VALUE;
/*     */   }
/*     */   
/*     */   private static final int f(String paramString) {
/* 195 */     return 0;
/*     */   }
/*     */   
/*     */   private static final int g(String paramString) {
/* 199 */     if (paramString.equals("a")) {
/* 200 */       return 0;
/*     */     }
/* 202 */     return 1;
/*     */   }
/*     */   
/*     */   private static Map h(String paramString)
/*     */   {
/* 207 */     HashMap localHashMap = new HashMap();
/* 208 */     if (paramString == null) return localHashMap;
/* 209 */     Matcher localMatcher = b.matcher(paramString);
/* 210 */     int i = 0;
/* 211 */     int j = -1;
/*     */     
/* 213 */     while (localMatcher.find()) {
/* 214 */       String str = null;
/*     */       
/* 216 */       switch (i++) {
/*     */       case 0: 
/* 218 */         str = "x";
/* 219 */         break;
/*     */       case 1: 
/* 221 */         str = "y";
/* 222 */         break;
/*     */       case 2: 
/* 224 */         str = "z";
/* 225 */         break;
/*     */       case 3: 
/* 227 */         str = "r";
/*     */       }
/*     */       
/*     */       
/* 231 */       if ((str != null) && (localMatcher.group(1).length() > 0)) localHashMap.put(str, localMatcher.group(1));
/* 232 */       j = localMatcher.end();
/*     */     }
/*     */     
/* 235 */     if (j < paramString.length()) {
/* 236 */       localMatcher = c.matcher(j == -1 ? paramString : paramString.substring(j));
/*     */       
/* 238 */       while (localMatcher.find()) {
/* 239 */         localHashMap.put(localMatcher.group(1), localMatcher.group(2));
/*     */       }
/*     */     }
/*     */     
/* 243 */     return localHashMap;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */