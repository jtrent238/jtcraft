/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
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
/*     */ public class ass
/*     */ {
/*  22 */   private final List a = new ArrayList();
/*  23 */   private final Map b = new HashMap();
/*     */   private int c;
/*     */   
/*     */   public int a() {
/*  27 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  31 */     this.c = paramInt;
/*     */   }
/*     */   
/*     */   public Map b() {
/*  35 */     return this.b;
/*     */   }
/*     */   
/*     */   public List c() {
/*  39 */     return this.a;
/*     */   }
/*     */   
/*     */   public void d() {
/*  43 */     int i = 0;
/*     */     
/*  45 */     for (ast localast : this.a) {
/*  46 */       localast.c(i);
/*  47 */       i += localast.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/*  53 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/*  55 */     localStringBuilder.append(2);
/*  56 */     localStringBuilder.append(";");
/*     */     
/*  58 */     for (int i = 0; i < this.a.size(); i++) {
/*  59 */       if (i > 0) localStringBuilder.append(",");
/*  60 */       localStringBuilder.append(((ast)this.a.get(i)).toString());
/*     */     }
/*     */     
/*  63 */     localStringBuilder.append(";");
/*  64 */     localStringBuilder.append(this.c);
/*     */     
/*  66 */     if (!this.b.isEmpty()) {
/*  67 */       localStringBuilder.append(";");
/*  68 */       i = 0;
/*     */       
/*  70 */       for (Map.Entry localEntry1 : this.b.entrySet()) {
/*  71 */         if (i++ > 0) localStringBuilder.append(",");
/*  72 */         localStringBuilder.append(((String)localEntry1.getKey()).toLowerCase());
/*     */         
/*  74 */         Map localMap = (Map)localEntry1.getValue();
/*  75 */         if (!localMap.isEmpty()) {
/*  76 */           localStringBuilder.append("(");
/*  77 */           int j = 0;
/*     */           
/*  79 */           for (Map.Entry localEntry2 : localMap.entrySet()) {
/*  80 */             if (j++ > 0) localStringBuilder.append(" ");
/*  81 */             localStringBuilder.append((String)localEntry2.getKey());
/*  82 */             localStringBuilder.append("=");
/*  83 */             localStringBuilder.append((String)localEntry2.getValue());
/*     */           }
/*     */           
/*  86 */           localStringBuilder.append(")");
/*     */         }
/*     */       }
/*     */     } else {
/*  90 */       localStringBuilder.append(";");
/*     */     }
/*     */     
/*  93 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   private static ast a(String paramString, int paramInt) {
/*  97 */     String[] arrayOfString = paramString.split("x", 2);
/*  98 */     int i = 1;
/*     */     
/* 100 */     int k = 0;
/*     */     
/* 102 */     if (arrayOfString.length == 2) {
/*     */       try {
/* 104 */         i = Integer.parseInt(arrayOfString[0]);
/* 105 */         if (paramInt + i >= 256) i = 256 - paramInt;
/* 106 */         if (i < 0) i = 0;
/*     */       } catch (Throwable localThrowable1) {
/* 108 */         return null;
/*     */       }
/*     */     }
/*     */     int j;
/*     */     try {
/* 113 */       String str = arrayOfString[(arrayOfString.length - 1)];
/* 114 */       arrayOfString = str.split(":", 2);
/* 115 */       j = Integer.parseInt(arrayOfString[0]);
/* 116 */       if (arrayOfString.length > 1) { k = Integer.parseInt(arrayOfString[1]);
/*     */       }
/* 118 */       if (aji.e(j) == ajn.a) {
/* 119 */         j = 0;
/* 120 */         k = 0;
/*     */       }
/*     */       
/* 123 */       if ((k < 0) || (k > 15)) k = 0;
/*     */     } catch (Throwable localThrowable2) {
/* 125 */       return null;
/*     */     }
/*     */     
/* 128 */     ast localast = new ast(i, aji.e(j), k);
/* 129 */     localast.c(paramInt);
/* 130 */     return localast;
/*     */   }
/*     */   
/*     */   private static List b(String paramString) {
/* 134 */     if ((paramString == null) || (paramString.length() < 1)) { return null;
/*     */     }
/* 136 */     ArrayList localArrayList = new ArrayList();
/* 137 */     String[] arrayOfString1 = paramString.split(",");
/* 138 */     int i = 0;
/*     */     
/* 140 */     for (String str : arrayOfString1) {
/* 141 */       ast localast = a(str, i);
/* 142 */       if (localast == null) return null;
/* 143 */       localArrayList.add(localast);
/* 144 */       i += localast.a();
/*     */     }
/*     */     
/* 147 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public static ass a(String paramString) {
/* 151 */     if (paramString == null) return e();
/* 152 */     String[] arrayOfString1 = paramString.split(";", -1);
/* 153 */     int i = arrayOfString1.length == 1 ? 0 : qh.a(arrayOfString1[0], 0);
/* 154 */     if ((i < 0) || (i > 2)) { return e();
/*     */     }
/* 156 */     ass localass = new ass();
/* 157 */     int j = arrayOfString1.length == 1 ? 0 : 1;
/* 158 */     List localList = b(arrayOfString1[(j++)]);
/*     */     
/* 160 */     if ((localList == null) || (localList.isEmpty())) {
/* 161 */       return e();
/*     */     }
/*     */     
/* 164 */     localass.c().addAll(localList);
/* 165 */     localass.d();
/*     */     
/* 167 */     int k = ahu.p.ay;
/* 168 */     if ((i > 0) && (arrayOfString1.length > j)) k = qh.a(arrayOfString1[(j++)], k);
/* 169 */     localass.a(k);
/*     */     
/* 171 */     if ((i > 0) && (arrayOfString1.length > j)) {
/* 172 */       String[] arrayOfString2 = arrayOfString1[(j++)].toLowerCase().split(",");
/*     */       
/* 174 */       for (String str : arrayOfString2) {
/* 175 */         String[] arrayOfString4 = str.split("\\(", 2);
/* 176 */         HashMap localHashMap = new HashMap();
/*     */         
/* 178 */         if (arrayOfString4[0].length() > 0) {
/* 179 */           localass.b().put(arrayOfString4[0], localHashMap);
/*     */           
/* 181 */           if ((arrayOfString4.length > 1) && (arrayOfString4[1].endsWith(")")) && (arrayOfString4[1].length() > 1)) {
/* 182 */             String[] arrayOfString5 = arrayOfString4[1].substring(0, arrayOfString4[1].length() - 1).split(" ");
/*     */             
/* 184 */             for (int i1 = 0; i1 < arrayOfString5.length; i1++) {
/* 185 */               String[] arrayOfString6 = arrayOfString5[i1].split("=", 2);
/* 186 */               if (arrayOfString6.length == 2) localHashMap.put(arrayOfString6[0], arrayOfString6[1]);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     } else {
/* 192 */       localass.b().put("village", new HashMap());
/*     */     }
/*     */     
/* 195 */     return localass;
/*     */   }
/*     */   
/*     */   public static ass e() {
/* 199 */     ass localass = new ass();
/*     */     
/* 201 */     localass.a(ahu.p.ay);
/* 202 */     localass.c().add(new ast(1, ajn.h));
/* 203 */     localass.c().add(new ast(2, ajn.d));
/* 204 */     localass.c().add(new ast(1, ajn.c));
/* 205 */     localass.d();
/* 206 */     localass.b().put("village", new HashMap());
/*     */     
/* 208 */     return localass;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */