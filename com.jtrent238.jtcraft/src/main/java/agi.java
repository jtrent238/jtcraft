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
/*     */ public class agi
/*     */   extends aft
/*     */ {
/*  14 */   private static final String[] E = { "all", "fire", "fall", "explosion", "projectile" };
/*     */   
/*     */ 
/*     */ 
/*  18 */   private static final int[] F = { 1, 10, 5, 5, 3 };
/*     */   
/*     */ 
/*     */ 
/*  22 */   private static final int[] G = { 11, 8, 6, 8, 6 };
/*     */   
/*     */ 
/*     */ 
/*  26 */   private static final int[] H = { 20, 12, 10, 12, 15 };
/*     */   
/*     */   public final int a;
/*     */   
/*     */ 
/*     */   public agi(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  33 */     super(paramInt1, paramInt2, afu.b);
/*  34 */     this.a = paramInt3;
/*     */     
/*  36 */     if (paramInt3 == 2) {
/*  37 */       this.C = afu.c;
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/*  43 */     return F[this.a] + (paramInt - 1) * G[this.a];
/*     */   }
/*     */   
/*     */   public int b(int paramInt)
/*     */   {
/*  48 */     return a(paramInt) + H[this.a];
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  53 */     return 4;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, ro paramro)
/*     */   {
/*  58 */     if (paramro.g()) { return 0;
/*     */     }
/*  60 */     float f = (6 + paramInt * paramInt) / 3.0F;
/*     */     
/*  62 */     if (this.a == 0) return qh.d(f * 0.75F);
/*  63 */     if ((this.a == 1) && (paramro.o())) return qh.d(f * 1.25F);
/*  64 */     if ((this.a == 2) && (paramro == ro.h)) return qh.d(f * 2.5F);
/*  65 */     if ((this.a == 3) && (paramro.c())) return qh.d(f * 1.5F);
/*  66 */     if ((this.a == 4) && (paramro.a())) return qh.d(f * 1.5F);
/*  67 */     return 0;
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/*  72 */     return "enchantment.protect." + E[this.a];
/*     */   }
/*     */   
/*     */   public boolean a(aft paramaft)
/*     */   {
/*  77 */     if ((paramaft instanceof agi)) {
/*  78 */       agi localagi = (agi)paramaft;
/*     */       
/*  80 */       if (localagi.a == this.a) {
/*  81 */         return false;
/*     */       }
/*  83 */       if ((this.a == 2) || (localagi.a == 2)) {
/*  84 */         return true;
/*     */       }
/*  86 */       return false;
/*     */     }
/*  88 */     return super.a(paramaft);
/*     */   }
/*     */   
/*     */   public static int a(sa paramsa, int paramInt) {
/*  92 */     int i = afv.a(aft.e.B, paramsa.ak());
/*     */     
/*  94 */     if (i > 0) {
/*  95 */       paramInt -= qh.d(paramInt * (i * 0.15F));
/*     */     }
/*     */     
/*  98 */     return paramInt;
/*     */   }
/*     */   
/*     */   public static double a(sa paramsa, double paramDouble) {
/* 102 */     int i = afv.a(aft.g.B, paramsa.ak());
/*     */     
/* 104 */     if (i > 0) {
/* 105 */       paramDouble -= qh.c(paramDouble * (i * 0.15F));
/*     */     }
/*     */     
/* 108 */     return paramDouble;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */