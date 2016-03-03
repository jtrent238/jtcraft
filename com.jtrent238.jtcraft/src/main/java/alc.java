/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class alc
/*     */   extends ajr
/*     */ {
/*  14 */   private static final String[][] M = { { "flower_dandelion" }, { "flower_rose", "flower_blue_orchid", "flower_allium", "flower_houstonia", "flower_tulip_red", "flower_tulip_orange", "flower_tulip_white", "flower_tulip_pink", "flower_oxeye_daisy" } };
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
/*  35 */   public static final String[] a = { "poppy", "blueOrchid", "allium", "houstonia", "tulipRed", "tulipOrange", "tulipWhite", "tulipPink", "oxeyeDaisy" };
/*     */   
/*     */ 
/*     */ 
/*  39 */   public static final String[] b = { "dandelion" };
/*     */   
/*     */   private rf[] N;
/*     */   
/*     */   private int O;
/*     */   
/*     */   protected alc(int paramInt)
/*     */   {
/*  47 */     super(awt.k);
/*  48 */     this.O = paramInt;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  53 */     if (paramInt2 >= this.N.length) paramInt2 = 0;
/*  54 */     return this.N[paramInt2];
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  59 */     this.N = new rf[M[this.O].length];
/*     */     
/*  61 */     for (int i = 0; i < this.N.length; i++) {
/*  62 */       this.N[i] = paramrg.a(M[this.O][i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/*  68 */     return paramInt;
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/*  73 */     for (int i = 0; i < this.N.length; i++)
/*  74 */       paramList.add(new add(paramadb, 1, i));
/*     */   }
/*     */   
/*     */   public static alc e(String paramString) {
/*     */     String str;
/*  79 */     for (str : b) {
/*  80 */       if (str.equals(paramString)) {
/*  81 */         return ajn.N;
/*     */       }
/*     */     }
/*  84 */     for (str : a) {
/*  85 */       if (str.equals(paramString)) {
/*  86 */         return ajn.O;
/*     */       }
/*     */     }
/*  89 */     return null;
/*     */   }
/*     */   
/*     */   public static int f(String paramString) {
/*  93 */     for (int i = 0; i < b.length; i++) {
/*  94 */       if (b[i].equals(paramString)) {
/*  95 */         return i;
/*     */       }
/*     */     }
/*  98 */     for (i = 0; i < a.length; i++) {
/*  99 */       if (a[i].equals(paramString)) {
/* 100 */         return i;
/*     */       }
/*     */     }
/* 103 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */