/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class bdx
/*     */   extends bdw
/*     */   implements bcv
/*     */ {
/*  21 */   private static final Logger g = ;
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
/*  32 */   private final DateFormat h = new SimpleDateFormat();
/*     */   
/*     */   protected bdw a;
/*  35 */   protected String f = "Select world";
/*     */   private boolean i;
/*     */   private int r;
/*     */   private List s;
/*     */   private bdy t;
/*     */   private String u;
/*     */   private String v;
/*  42 */   private String[] w = new String[3];
/*     */   private boolean x;
/*     */   private bcb y;
/*     */   private bcb z;
/*     */   private bcb A;
/*     */   private bcb B;
/*     */   
/*     */   public bdx(bdw parambdw)
/*     */   {
/*  51 */     this.a = parambdw;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  56 */     this.f = brp.a("selectWorld.title", new Object[0]);
/*     */     try
/*     */     {
/*  59 */       f();
/*     */     } catch (azd localazd) {
/*  61 */       g.error("Couldn't load level list", localazd);
/*  62 */       this.k.a(new bdh("Unable to load worlds", localazd.getMessage()));
/*  63 */       return;
/*     */     }
/*     */     
/*  66 */     this.u = brp.a("selectWorld.world", new Object[0]);
/*  67 */     this.v = brp.a("selectWorld.conversion", new Object[0]);
/*  68 */     this.w[ahk.b.a()] = brp.a("gameMode.survival", new Object[0]);
/*  69 */     this.w[ahk.c.a()] = brp.a("gameMode.creative", new Object[0]);
/*  70 */     this.w[ahk.d.a()] = brp.a("gameMode.adventure", new Object[0]);
/*     */     
/*  72 */     this.t = new bdy(this);
/*  73 */     this.t.d(4, 5);
/*     */     
/*  75 */     a();
/*     */   }
/*     */   
/*     */   private void f() {
/*  79 */     aze localaze = this.k.d();
/*  80 */     this.s = localaze.b();
/*  81 */     Collections.sort(this.s);
/*  82 */     this.r = -1;
/*     */   }
/*     */   
/*     */   protected String b(int paramInt) {
/*  86 */     return ((azf)this.s.get(paramInt)).a();
/*     */   }
/*     */   
/*     */   protected String d(int paramInt) {
/*  90 */     String str = ((azf)this.s.get(paramInt)).b();
/*     */     
/*  92 */     if ((str == null) || (qh.a(str))) {
/*  93 */       str = brp.a("selectWorld.world", new Object[0]) + " " + (paramInt + 1);
/*     */     }
/*     */     
/*  96 */     return str;
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/* 101 */     this.n.add(this.z = new bcb(1, this.l / 2 - 154, this.m - 52, 150, 20, brp.a("selectWorld.select", new Object[0])));
/* 102 */     this.n.add(new bcb(3, this.l / 2 + 4, this.m - 52, 150, 20, brp.a("selectWorld.create", new Object[0])));
/*     */     
/* 104 */     this.n.add(this.A = new bcb(6, this.l / 2 - 154, this.m - 28, 72, 20, brp.a("selectWorld.rename", new Object[0])));
/* 105 */     this.n.add(this.y = new bcb(2, this.l / 2 - 76, this.m - 28, 72, 20, brp.a("selectWorld.delete", new Object[0])));
/* 106 */     this.n.add(this.B = new bcb(7, this.l / 2 + 4, this.m - 28, 72, 20, brp.a("selectWorld.recreate", new Object[0])));
/* 107 */     this.n.add(new bcb(0, this.l / 2 + 82, this.m - 28, 72, 20, brp.a("gui.cancel", new Object[0])));
/*     */     
/* 109 */     this.z.l = false;
/* 110 */     this.y.l = false;
/* 111 */     this.A.l = false;
/* 112 */     this.B.l = false;
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 117 */     if (!parambcb.l) return;
/* 118 */     Object localObject1; Object localObject2; if (parambcb.k == 2) {
/* 119 */       localObject1 = d(this.r);
/* 120 */       if (localObject1 != null) {
/* 121 */         this.x = true;
/*     */         
/* 123 */         localObject2 = a(this, (String)localObject1, this.r);
/* 124 */         this.k.a((bdw)localObject2);
/*     */       }
/* 126 */     } else if (parambcb.k == 1) {
/* 127 */       e(this.r);
/* 128 */     } else if (parambcb.k == 3) {
/* 129 */       this.k.a(new bdb(this));
/* 130 */     } else if (parambcb.k == 6) {
/* 131 */       this.k.a(new bdv(this, b(this.r)));
/* 132 */     } else if (parambcb.k == 0) {
/* 133 */       this.k.a(this.a);
/* 134 */     } else if (parambcb.k == 7) {
/* 135 */       localObject1 = new bdb(this);
/* 136 */       localObject2 = this.k.d().a(b(this.r), false);
/* 137 */       ays localays = ((azc)localObject2).d();
/* 138 */       ((azc)localObject2).a();
/*     */       
/* 140 */       ((bdb)localObject1).a(localays);
/* 141 */       this.k.a((bdw)localObject1);
/*     */     } else {
/* 143 */       this.t.a(parambcb);
/*     */     }
/*     */   }
/*     */   
/*     */   public void e(int paramInt) {
/* 148 */     this.k.a(null);
/* 149 */     if (this.i) return;
/* 150 */     this.i = true;
/*     */     
/* 152 */     String str1 = b(paramInt);
/* 153 */     if (str1 == null) {
/* 154 */       str1 = "World" + paramInt;
/*     */     }
/* 156 */     String str2 = d(paramInt);
/* 157 */     if (str2 == null) {
/* 158 */       str2 = "World" + paramInt;
/*     */     }
/*     */     
/* 161 */     if (this.k.d().f(str1)) {
/* 162 */       this.k.a(str1, str2, null);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt)
/*     */   {
/* 168 */     if (this.x) {
/* 169 */       this.x = false;
/* 170 */       if (paramBoolean) {
/* 171 */         aze localaze = this.k.d();
/* 172 */         localaze.d();
/* 173 */         localaze.e(b(paramInt));
/*     */         try
/*     */         {
/* 176 */           f();
/*     */         } catch (azd localazd) {
/* 178 */           g.error("Couldn't load level list", localazd);
/*     */         }
/*     */       }
/* 181 */       this.k.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 187 */     this.t.a(paramInt1, paramInt2, paramFloat);
/*     */     
/* 189 */     a(this.q, this.f, this.l / 2, 20, 16777215);
/*     */     
/* 191 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static bcw a(bcv parambcv, String paramString, int paramInt)
/*     */   {
/* 268 */     String str1 = brp.a("selectWorld.deleteQuestion", new Object[0]);
/* 269 */     String str2 = "'" + paramString + "' " + brp.a("selectWorld.deleteWarning", new Object[0]);
/* 270 */     String str3 = brp.a("selectWorld.deleteButton", new Object[0]);
/* 271 */     String str4 = brp.a("gui.cancel", new Object[0]);
/*     */     
/* 273 */     bcw localbcw = new bcw(parambcv, str1, str2, str3, str4, paramInt);
/*     */     
/* 275 */     return localbcw;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */