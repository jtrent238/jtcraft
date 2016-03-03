/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bmk
/*     */ {
/*  19 */   private Map m = new HashMap();
/*     */   
/*  21 */   public static bmk a = new bmk();
/*     */   private bbu n;
/*     */   public static double b;
/*     */   public static double c;
/*     */   public static double d;
/*     */   public bqf e;
/*     */   public ahb f;
/*     */   public sv g;
/*     */   public float h;
/*     */   public float i;
/*     */   public double j;
/*     */   public double k;
/*     */   public double l;
/*     */   
/*  35 */   private bmk() { this.m.put(apm.class, new bmr());
/*  36 */     this.m.put(apj.class, new bmp());
/*  37 */     this.m.put(aps.class, new bmq());
/*  38 */     this.m.put(aow.class, new bmm());
/*  39 */     this.m.put(ape.class, new bmo());
/*  40 */     this.m.put(apd.class, new bmn());
/*  41 */     this.m.put(apo.class, new bmt());
/*  42 */     this.m.put(aoq.class, new bmj());
/*  43 */     this.m.put(apn.class, new bms());
/*     */     
/*  45 */     for (bml localbml : this.m.values()) {
/*  46 */       localbml.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public bml a(Class paramClass)
/*     */   {
/*  52 */     bml localbml = (bml)this.m.get(paramClass);
/*  53 */     if ((localbml == null) && (paramClass != aor.class)) {
/*  54 */       localbml = a(paramClass.getSuperclass());
/*  55 */       this.m.put(paramClass, localbml);
/*     */     }
/*  57 */     return localbml;
/*     */   }
/*     */   
/*     */   public boolean a(aor paramaor) {
/*  61 */     return b(paramaor) != null;
/*     */   }
/*     */   
/*     */   public bml b(aor paramaor) {
/*  65 */     if (paramaor == null) return null;
/*  66 */     return a(paramaor.getClass());
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, bqf parambqf, bbu parambbu, sv paramsv, float paramFloat) {
/*  70 */     if (this.f != paramahb) {
/*  71 */       a(paramahb);
/*     */     }
/*  73 */     this.e = parambqf;
/*  74 */     this.g = paramsv;
/*  75 */     this.n = parambbu;
/*     */     
/*  77 */     this.h = (paramsv.A + (paramsv.y - paramsv.A) * paramFloat);
/*  78 */     this.i = (paramsv.B + (paramsv.z - paramsv.B) * paramFloat);
/*     */     
/*  80 */     this.j = (paramsv.S + (paramsv.s - paramsv.S) * paramFloat);
/*  81 */     this.k = (paramsv.T + (paramsv.t - paramsv.T) * paramFloat);
/*  82 */     this.l = (paramsv.U + (paramsv.u - paramsv.U) * paramFloat);
/*     */   }
/*     */   
/*     */   public void a(aor paramaor, float paramFloat) {
/*  86 */     if (paramaor.a(this.j, this.k, this.l) < paramaor.n()) {
/*  87 */       int i1 = this.f.c(paramaor.c, paramaor.d, paramaor.e, 0);
/*  88 */       int i2 = i1 % 65536;
/*  89 */       int i3 = i1 / 65536;
/*  90 */       buu.a(buu.c, i2 / 1.0F, i3 / 1.0F);
/*  91 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  92 */       a(paramaor, paramaor.c - b, paramaor.d - c, paramaor.e - d, paramFloat);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aor paramaor, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  97 */     bml localbml = b(paramaor);
/*  98 */     if (localbml != null) {
/*     */       try {
/* 100 */         localbml.a(paramaor, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*     */       } catch (Throwable localThrowable) {
/* 102 */         b localb = b.a(localThrowable, "Rendering Block Entity");
/* 103 */         k localk = localb.a("Block Entity Details");
/*     */         
/* 105 */         paramaor.a(localk);
/*     */         
/* 107 */         throw new s(localb);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb) {
/* 113 */     this.f = paramahb;
/*     */     
/* 115 */     for (bml localbml : this.m.values()) {
/* 116 */       if (localbml != null) {
/* 117 */         localbml.a(paramahb);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bbu a()
/*     */   {
/* 130 */     return this.n;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */