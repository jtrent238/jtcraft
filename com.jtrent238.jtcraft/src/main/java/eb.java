/*     */ import java.util.ArrayList;
/*     */ import java.util.Stack;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class eb
/*     */ {
/*   9 */   private static final Logger a = ;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static dy a(String paramString)
/*     */   {
/*  16 */     paramString = paramString.trim();
/*  17 */     int i = b(paramString);
/*  18 */     if (i != 1) {
/*  19 */       throw new ea("Encountered multiple top tags, only one expected");
/*     */     }
/*     */     
/*  22 */     ec localec = null;
/*  23 */     if (paramString.startsWith("{")) {
/*  24 */       localec = a("tag", paramString);
/*     */     } else {
/*  26 */       localec = a(b(paramString, false), c(paramString, false));
/*     */     }
/*     */     
/*  29 */     return localec.a();
/*     */   }
/*     */   
/*     */   static int b(String paramString)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     Stack localStack = new Stack();
/*     */     
/*  38 */     int k = 0;
/*  39 */     while (k < paramString.length()) {
/*  40 */       char c = paramString.charAt(k);
/*  41 */       if (c == '"') {
/*  42 */         if ((k > 0) && (paramString.charAt(k - 1) == '\\')) {
/*  43 */           if (j == 0) {
/*  44 */             throw new ea("Illegal use of \\\": " + paramString);
/*     */           }
/*     */         } else {
/*  47 */           j = j == 0 ? 1 : 0;
/*     */         }
/*  49 */       } else if (j == 0) {
/*  50 */         if ((c == '{') || (c == '[')) {
/*  51 */           if (localStack.isEmpty()) {
/*  52 */             i++;
/*     */           }
/*  54 */           localStack.push(Character.valueOf(c));
/*  55 */         } else { if ((c == '}') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '{')))
/*  56 */             throw new ea("Unbalanced curly brackets {}: " + paramString);
/*  57 */           if ((c == ']') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '[')))
/*  58 */             throw new ea("Unbalanced square brackets []: " + paramString);
/*     */         }
/*     */       }
/*  61 */       k++;
/*     */     }
/*  63 */     if (j != 0) {
/*  64 */       throw new ea("Unbalanced quotation: " + paramString);
/*     */     }
/*  66 */     if (!localStack.isEmpty()) {
/*  67 */       throw new ea("Unbalanced brackets: " + paramString);
/*     */     }
/*     */     
/*  70 */     if ((i == 0) && (!paramString.isEmpty())) {
/*  71 */       return 1;
/*     */     }
/*  73 */     return i;
/*     */   }
/*     */   
/*     */   static ec a(String paramString1, String paramString2) {
/*  77 */     paramString2 = paramString2.trim();
/*  78 */     b(paramString2);
/*     */     Object localObject;
/*  80 */     String str1; String str2; String str3; char c; if (paramString2.startsWith("{")) {
/*  81 */       if (!paramString2.endsWith("}")) {
/*  82 */         throw new ea("Unable to locate ending bracket for: " + paramString2);
/*     */       }
/*     */       
/*  85 */       paramString2 = paramString2.substring(1, paramString2.length() - 1);
/*     */       
/*  87 */       localObject = new ed(paramString1);
/*  88 */       while (paramString2.length() > 0) {
/*  89 */         str1 = a(paramString2, false);
/*  90 */         if (str1.length() > 0) {
/*  91 */           str2 = b(str1, false);
/*  92 */           str3 = c(str1, false);
/*  93 */           ((ed)localObject).b.add(a(str2, str3));
/*     */           
/*  95 */           if (paramString2.length() < str1.length() + 1) break;
/*  96 */           c = paramString2.charAt(str1.length());
/*  97 */           if ((c != ',') && (c != '{') && (c != '}') && (c != '[') && (c != ']')) {
/*  98 */             throw new ea("Unexpected token '" + c + "' at: " + paramString2.substring(str1.length()));
/*     */           }
/* 100 */           paramString2 = paramString2.substring(str1.length() + 1);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 107 */       return (ec)localObject; }
/* 108 */     if ((paramString2.startsWith("[")) && (!paramString2.matches("\\[[-\\d|,\\s]+\\]"))) {
/* 109 */       if (!paramString2.endsWith("]")) {
/* 110 */         throw new ea("Unable to locate ending bracket for: " + paramString2);
/*     */       }
/*     */       
/* 113 */       paramString2 = paramString2.substring(1, paramString2.length() - 1);
/*     */       
/* 115 */       localObject = new ee(paramString1);
/* 116 */       while (paramString2.length() > 0) {
/* 117 */         str1 = a(paramString2, true);
/* 118 */         if (str1.length() > 0) {
/* 119 */           str2 = b(str1, true);
/* 120 */           str3 = c(str1, true);
/* 121 */           ((ee)localObject).b.add(a(str2, str3));
/*     */           
/* 123 */           if (paramString2.length() < str1.length() + 1) break;
/* 124 */           c = paramString2.charAt(str1.length());
/* 125 */           if ((c != ',') && (c != '{') && (c != '}') && (c != '[') && (c != ']')) {
/* 126 */             throw new ea("Unexpected token '" + c + "' at: " + paramString2.substring(str1.length()));
/*     */           }
/* 128 */           paramString2 = paramString2.substring(str1.length() + 1);
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 133 */           a.debug(paramString2);
/*     */         }
/*     */       }
/*     */       
/* 137 */       return (ec)localObject;
/*     */     }
/* 139 */     return new ef(paramString1, paramString2);
/*     */   }
/*     */   
/*     */   private static String a(String paramString, boolean paramBoolean)
/*     */   {
/* 144 */     int i = a(paramString, ':');
/* 145 */     if ((i < 0) && (!paramBoolean)) {
/* 146 */       throw new ea("Unable to locate name/value separator for string: " + paramString);
/*     */     }
/* 148 */     int j = a(paramString, ',');
/* 149 */     if ((j >= 0) && (j < i) && (!paramBoolean)) {
/* 150 */       throw new ea("Name error at: " + paramString);
/*     */     }
/* 152 */     if ((paramBoolean) && ((i < 0) || (i > j))) {
/* 153 */       i = -1;
/*     */     }
/*     */     
/* 156 */     Stack localStack = new Stack();
/* 157 */     int k = i + 1;
/* 158 */     int m = 0;
/* 159 */     int n = 0;
/* 160 */     int i1 = 0;
/* 161 */     int i2 = 0;
/*     */     
/* 163 */     while (k < paramString.length()) {
/* 164 */       char c = paramString.charAt(k);
/*     */       
/* 166 */       if (c == '"') {
/* 167 */         if ((k > 0) && (paramString.charAt(k - 1) == '\\')) {
/* 168 */           if (m == 0) {
/* 169 */             throw new ea("Illegal use of \\\": " + paramString);
/*     */           }
/*     */         } else {
/* 172 */           m = m == 0 ? 1 : 0;
/* 173 */           if ((m != 0) && (i1 == 0)) {
/* 174 */             n = 1;
/*     */           }
/* 176 */           if (m == 0) {
/* 177 */             i2 = k;
/*     */           }
/*     */         }
/* 180 */       } else if (m == 0) {
/* 181 */         if ((c == '{') || (c == '[')) {
/* 182 */           localStack.push(Character.valueOf(c));
/* 183 */         } else { if ((c == '}') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '{')))
/* 184 */             throw new ea("Unbalanced curly brackets {}: " + paramString);
/* 185 */           if ((c == ']') && ((localStack.isEmpty()) || (((Character)localStack.pop()).charValue() != '[')))
/* 186 */             throw new ea("Unbalanced square brackets []: " + paramString);
/* 187 */           if ((c == ',') && 
/* 188 */             (localStack.isEmpty())) {
/* 189 */             return paramString.substring(0, k);
/*     */           }
/*     */         }
/*     */       }
/* 193 */       if (!Character.isWhitespace(c)) {
/* 194 */         if ((m == 0) && (n != 0) && (i2 != k)) {
/* 195 */           return paramString.substring(0, i2 + 1);
/*     */         }
/* 197 */         i1 = 1;
/*     */       }
/*     */       
/* 200 */       k++;
/*     */     }
/*     */     
/* 203 */     return paramString.substring(0, k);
/*     */   }
/*     */   
/*     */   private static String b(String paramString, boolean paramBoolean) {
/* 207 */     if (paramBoolean) {
/* 208 */       paramString = paramString.trim();
/* 209 */       if ((paramString.startsWith("{")) || (paramString.startsWith("["))) {
/* 210 */         return "";
/*     */       }
/*     */     }
/*     */     
/* 214 */     int i = paramString.indexOf(':');
/* 215 */     if (i < 0) {
/* 216 */       if (paramBoolean) {
/* 217 */         return "";
/*     */       }
/* 219 */       throw new ea("Unable to locate name/value separator for string: " + paramString);
/*     */     }
/* 221 */     return paramString.substring(0, i).trim();
/*     */   }
/*     */   
/*     */   private static String c(String paramString, boolean paramBoolean) {
/* 225 */     if (paramBoolean) {
/* 226 */       paramString = paramString.trim();
/* 227 */       if ((paramString.startsWith("{")) || (paramString.startsWith("["))) {
/* 228 */         return paramString;
/*     */       }
/*     */     }
/*     */     
/* 232 */     int i = paramString.indexOf(':');
/* 233 */     if (i < 0) {
/* 234 */       if (paramBoolean) {
/* 235 */         return paramString;
/*     */       }
/* 237 */       throw new ea("Unable to locate name/value separator for string: " + paramString);
/*     */     }
/* 239 */     return paramString.substring(i + 1).trim();
/*     */   }
/*     */   
/*     */   private static int a(String paramString, char paramChar) {
/* 243 */     int i = 0;
/* 244 */     int j = 0;
/* 245 */     while (i < paramString.length()) {
/* 246 */       char c = paramString.charAt(i);
/* 247 */       if (c == '"') {
/* 248 */         if ((i <= 0) || (paramString.charAt(i - 1) != '\\'))
/*     */         {
/* 250 */           j = j == 0 ? 1 : 0;
/*     */         }
/* 252 */       } else if (j == 0) {
/* 253 */         if (c == paramChar) {
/* 254 */           return i;
/*     */         }
/* 256 */         if ((c == '{') || (c == '[')) {
/* 257 */           return -1;
/*     */         }
/*     */       }
/* 260 */       i++;
/*     */     }
/* 262 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */