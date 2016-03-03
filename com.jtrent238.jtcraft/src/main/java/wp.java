/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wp
/*     */   extends wf
/*     */ {
/*  28 */   private final aae bq = new aae(new wq(this), 2, 1);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  38 */   public static final float[][] bp = { { 1.0F, 1.0F, 1.0F }, { 0.85F, 0.5F, 0.2F }, { 0.7F, 0.3F, 0.85F }, { 0.4F, 0.6F, 0.85F }, { 0.9F, 0.9F, 0.2F }, { 0.5F, 0.8F, 0.1F }, { 0.95F, 0.5F, 0.65F }, { 0.3F, 0.3F, 0.3F }, { 0.6F, 0.6F, 0.6F }, { 0.3F, 0.5F, 0.6F }, { 0.5F, 0.25F, 0.7F }, { 0.2F, 0.3F, 0.7F }, { 0.4F, 0.3F, 0.2F }, { 0.4F, 0.5F, 0.2F }, { 0.6F, 0.2F, 0.2F }, { 0.1F, 0.1F, 0.1F } };
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
/*     */   private int br;
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
/*  61 */   private ud bs = new ud(this);
/*     */   
/*     */   public wp(ahb paramahb) {
/*  64 */     super(paramahb);
/*  65 */     a(0.9F, 1.3F);
/*     */     
/*  67 */     m().a(true);
/*  68 */     this.c.a(0, new uf(this));
/*  69 */     this.c.a(1, new uz(this, 1.25D));
/*  70 */     this.c.a(2, new ua(this, 1.0D));
/*  71 */     this.c.a(3, new vk(this, 1.1D, ade.O, false));
/*  72 */     this.c.a(4, new uh(this, 1.1D));
/*  73 */     this.c.a(5, this.bs);
/*  74 */     this.c.a(6, new vc(this, 1.0D));
/*  75 */     this.c.a(7, new un(this, yz.class, 6.0F));
/*  76 */     this.c.a(8, new vb(this));
/*     */     
/*  78 */     this.bq.a(0, new add(ade.aR, 1, 0));
/*  79 */     this.bq.a(1, new add(ade.aR, 1, 0));
/*     */   }
/*     */   
/*     */   protected boolean bk()
/*     */   {
/*  84 */     return true;
/*     */   }
/*     */   
/*     */   protected void bn()
/*     */   {
/*  89 */     this.br = this.bs.f();
/*  90 */     super.bn();
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  95 */     if (this.o.E) this.br = Math.max(0, this.br - 1);
/*  96 */     super.e();
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/* 101 */     super.aD();
/*     */     
/* 103 */     a(yj.a).a(8.0D);
/* 104 */     a(yj.d).a(0.23000000417232513D);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/* 109 */     super.c();
/*     */     
/*     */ 
/* 112 */     this.af.a(16, new Byte((byte)0));
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 117 */     if (!ca())
/*     */     {
/* 119 */       a(new add(adb.a(ajn.L), 1, bZ()), 0.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 125 */     return adb.a(ajn.L);
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 130 */     if (paramByte == 10) {
/* 131 */       this.br = 40;
/*     */     } else {
/* 133 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/*     */   public float p(float paramFloat) {
/* 138 */     if (this.br <= 0) {
/* 139 */       return 0.0F;
/*     */     }
/* 141 */     if ((this.br >= 4) && (this.br <= 36)) {
/* 142 */       return 1.0F;
/*     */     }
/* 144 */     if (this.br < 4) {
/* 145 */       return (this.br - paramFloat) / 4.0F;
/*     */     }
/* 147 */     return -(this.br - 40 - paramFloat) / 4.0F;
/*     */   }
/*     */   
/*     */   public float q(float paramFloat) {
/* 151 */     if ((this.br > 4) && (this.br <= 36)) {
/* 152 */       float f = (this.br - 4 - paramFloat) / 32.0F;
/* 153 */       return 0.62831855F + 0.21991149F * qh.a(f * 28.7F);
/*     */     }
/* 155 */     if (this.br > 0) {
/* 156 */       return 0.62831855F;
/*     */     }
/* 158 */     return this.z / 57.295776F;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 163 */     add localadd = paramyz.bm.h();
/*     */     
/* 165 */     if ((localadd != null) && (localadd.b() == ade.aZ) && (!ca()) && (!f())) {
/* 166 */       if (!this.o.E) {
/* 167 */         i(true);
/* 168 */         int i = 1 + this.Z.nextInt(3);
/* 169 */         for (int j = 0; j < i; j++) {
/* 170 */           xk localxk = a(new add(adb.a(ajn.L), 1, bZ()), 1.0F);
/* 171 */           localxk.w += this.Z.nextFloat() * 0.05F;
/* 172 */           localxk.v += (this.Z.nextFloat() - this.Z.nextFloat()) * 0.1F;
/* 173 */           localxk.x += (this.Z.nextFloat() - this.Z.nextFloat()) * 0.1F;
/*     */         }
/*     */       }
/* 176 */       localadd.a(1, paramyz);
/* 177 */       a("mob.sheep.shear", 1.0F, 1.0F);
/*     */     }
/*     */     
/* 180 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 185 */     super.b(paramdh);
/* 186 */     paramdh.a("Sheared", ca());
/* 187 */     paramdh.a("Color", (byte)bZ());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 192 */     super.a(paramdh);
/* 193 */     i(paramdh.n("Sheared"));
/* 194 */     s(paramdh.d("Color"));
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 199 */     return "mob.sheep.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 204 */     return "mob.sheep.say";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 209 */     return "mob.sheep.say";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 214 */     a("mob.sheep.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   public int bZ() {
/* 218 */     return this.af.a(16) & 0xF;
/*     */   }
/*     */   
/*     */   public void s(int paramInt) {
/* 222 */     int i = this.af.a(16);
/* 223 */     this.af.b(16, Byte.valueOf((byte)(i & 0xF0 | paramInt & 0xF)));
/*     */   }
/*     */   
/*     */   public boolean ca() {
/* 227 */     return (this.af.a(16) & 0x10) != 0;
/*     */   }
/*     */   
/*     */   public void i(boolean paramBoolean) {
/* 231 */     int i = this.af.a(16);
/* 232 */     if (paramBoolean) {
/* 233 */       this.af.b(16, Byte.valueOf((byte)(i | 0x10)));
/*     */     } else {
/* 235 */       this.af.b(16, Byte.valueOf((byte)(i & 0xFFFFFFEF)));
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(Random paramRandom) {
/* 240 */     int i = paramRandom.nextInt(100);
/* 241 */     if (i < 5) {
/* 242 */       return 15;
/*     */     }
/* 244 */     if (i < 10) {
/* 245 */       return 7;
/*     */     }
/* 247 */     if (i < 15) {
/* 248 */       return 8;
/*     */     }
/* 250 */     if (i < 18) {
/* 251 */       return 12;
/*     */     }
/* 253 */     if (paramRandom.nextInt(500) == 0) return 6;
/* 254 */     return 0;
/*     */   }
/*     */   
/*     */   public wp b(rx paramrx)
/*     */   {
/* 259 */     wp localwp1 = (wp)paramrx;
/* 260 */     wp localwp2 = new wp(this.o);
/*     */     
/* 262 */     int i = a(this, localwp1);
/* 263 */     localwp2.s(15 - i);
/*     */     
/* 265 */     return localwp2;
/*     */   }
/*     */   
/*     */   public void p()
/*     */   {
/* 270 */     i(false);
/* 271 */     if (f())
/*     */     {
/* 273 */       a(60);
/*     */     }
/*     */   }
/*     */   
/*     */   public sy a(sy paramsy)
/*     */   {
/* 279 */     paramsy = super.a(paramsy);
/*     */     
/* 281 */     s(a(this.o.s));
/* 282 */     return paramsy;
/*     */   }
/*     */   
/*     */   private int a(wf paramwf1, wf paramwf2) {
/* 286 */     int i = b(paramwf1);
/* 287 */     int j = b(paramwf2);
/*     */     
/* 289 */     this.bq.a(0).b(i);
/* 290 */     this.bq.a(1).b(j);
/*     */     
/* 292 */     add localadd = afe.a().a(this.bq, ((wp)paramwf1).o);
/*     */     
/*     */     int k;
/* 295 */     if ((localadd != null) && (localadd.b() == ade.aR)) {
/* 296 */       k = localadd.k();
/*     */     } else {
/* 298 */       k = this.o.s.nextBoolean() ? i : j;
/*     */     }
/* 300 */     return k;
/*     */   }
/*     */   
/*     */   private int b(wf paramwf) {
/* 304 */     return 15 - ((wp)paramwf).bZ();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */