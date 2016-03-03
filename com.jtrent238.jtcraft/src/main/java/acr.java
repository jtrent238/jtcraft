/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acr
/*     */   extends adb
/*     */ {
/*     */   private rf a;
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  16 */     if (paramInt2 > 0) {
/*  17 */       return this.a;
/*     */     }
/*  19 */     return super.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int a(add paramadd, int paramInt)
/*     */   {
/*  24 */     if (paramInt == 1) {
/*  25 */       dy localdy = a(paramadd, "Colors");
/*  26 */       if ((localdy != null) && ((localdy instanceof dn))) {
/*  27 */         dn localdn = (dn)localdy;
/*  28 */         int[] arrayOfInt1 = localdn.c();
/*  29 */         if (arrayOfInt1.length == 1) {
/*  30 */           return arrayOfInt1[0];
/*     */         }
/*  32 */         int i = 0;
/*  33 */         int j = 0;
/*  34 */         int k = 0;
/*  35 */         for (int i1 : arrayOfInt1) {
/*  36 */           i += ((i1 & 0xFF0000) >> 16);
/*  37 */           j += ((i1 & 0xFF00) >> 8);
/*  38 */           k += ((i1 & 0xFF) >> 0);
/*     */         }
/*  40 */         i /= arrayOfInt1.length;
/*  41 */         j /= arrayOfInt1.length;
/*  42 */         k /= arrayOfInt1.length;
/*  43 */         return i << 16 | j << 8 | k;
/*     */       }
/*  45 */       return 9079434;
/*     */     }
/*  47 */     return super.a(paramadd, paramInt);
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/*  52 */     return true;
/*     */   }
/*     */   
/*     */   public static dy a(add paramadd, String paramString) {
/*  56 */     if (paramadd.p()) {
/*  57 */       dh localdh = paramadd.q().m("Explosion");
/*  58 */       if (localdh != null) {
/*  59 */         return localdh.a(paramString);
/*     */       }
/*     */     }
/*  62 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean)
/*     */   {
/*  68 */     if (paramadd.p()) {
/*  69 */       dh localdh = paramadd.q().m("Explosion");
/*  70 */       if (localdh != null) {
/*  71 */         a(localdh, paramList);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(dh paramdh, List paramList)
/*     */   {
/*  78 */     int i = paramdh.d("Type");
/*  79 */     if ((i >= 0) && (i <= 4)) {
/*  80 */       paramList.add(dd.a("item.fireworksCharge.type." + i).trim());
/*     */     } else {
/*  82 */       paramList.add(dd.a("item.fireworksCharge.type").trim());
/*     */     }
/*     */     
/*     */ 
/*  86 */     int[] arrayOfInt1 = paramdh.l("Colors");
/*  87 */     int n; int i1; int i2; if (arrayOfInt1.length > 0)
/*     */     {
/*  89 */       int j = 1;
/*  90 */       String str = "";
/*  91 */       for (n : arrayOfInt1) {
/*  92 */         if (j == 0) {
/*  93 */           str = str + ", ";
/*     */         }
/*  95 */         j = 0;
/*     */         
/*     */ 
/*  98 */         i1 = 0;
/*  99 */         for (i2 = 0; i2 < 16; i2++) {
/* 100 */           if (n == acj.c[i2]) {
/* 101 */             i1 = 1;
/* 102 */             str = str + dd.a(new StringBuilder().append("item.fireworksCharge.").append(acj.a[i2]).toString());
/* 103 */             break;
/*     */           }
/*     */         }
/* 106 */         if (i1 == 0) {
/* 107 */           str = str + dd.a("item.fireworksCharge.customColor");
/*     */         }
/*     */       }
/* 110 */       paramList.add(str);
/*     */     }
/*     */     
/*     */ 
/* 114 */     int[] arrayOfInt2 = paramdh.l("FadeColors");
/* 115 */     if (arrayOfInt2.length > 0)
/*     */     {
/* 117 */       bool1 = true;
/* 118 */       ??? = dd.a("item.fireworksCharge.fadeTo") + " ";
/* 119 */       for (i1 : arrayOfInt2) {
/* 120 */         if (!bool1) {
/* 121 */           ??? = (String)??? + ", ";
/*     */         }
/* 123 */         bool1 = false;
/*     */         
/*     */ 
/* 126 */         i2 = 0;
/* 127 */         for (int i3 = 0; i3 < 16; i3++) {
/* 128 */           if (i1 == acj.c[i3]) {
/* 129 */             i2 = 1;
/* 130 */             ??? = (String)??? + dd.a(new StringBuilder().append("item.fireworksCharge.").append(acj.a[i3]).toString());
/* 131 */             break;
/*     */           }
/*     */         }
/* 134 */         if (i2 == 0) {
/* 135 */           ??? = (String)??? + dd.a("item.fireworksCharge.customColor");
/*     */         }
/*     */       }
/* 138 */       paramList.add(???);
/*     */     }
/*     */     
/*     */ 
/* 142 */     boolean bool1 = paramdh.n("Trail");
/* 143 */     if (bool1) {
/* 144 */       paramList.add(dd.a("item.fireworksCharge.trail"));
/*     */     }
/*     */     
/*     */ 
/* 148 */     boolean bool2 = paramdh.n("Flicker");
/* 149 */     if (bool2) {
/* 150 */       paramList.add(dd.a("item.fireworksCharge.flicker"));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 156 */     super.a(paramrg);
/* 157 */     this.a = paramrg.a(w() + "_overlay");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */