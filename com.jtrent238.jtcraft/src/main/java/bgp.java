/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Multimap;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.URI;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.opengl.ContextCapabilities;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ import tv.twitch.ErrorCode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bgp
/*     */   extends bdw
/*     */ {
/*  25 */   private static final Logger a = ;
/*     */   
/*     */ 
/*     */ 
/*  29 */   private final fj f = new fr("stream.unavailable.title", new Object[0]);
/*     */   private final bdw g;
/*     */   private final bgr h;
/*     */   private final List i;
/*  33 */   private final List r = Lists.newArrayList();
/*     */   
/*     */   public bgp(bdw parambdw, bgr parambgr) {
/*  36 */     this(parambdw, parambgr, null);
/*     */   }
/*     */   
/*     */   public bgp(bdw parambdw, bgr parambgr, List paramList) {
/*  40 */     this.g = parambdw;
/*  41 */     this.h = parambgr;
/*  42 */     this.i = paramList;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  47 */     if (this.r.isEmpty()) {
/*  48 */       this.r.addAll(this.q.c(this.h.a().d(), (int)(this.l * 0.75F)));
/*     */       
/*  50 */       if (this.i != null) {
/*  51 */         this.r.add("");
/*  52 */         for (fr localfr : this.i) {
/*  53 */           this.r.add(localfr.e());
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  58 */     if (this.h.b() != null) {
/*  59 */       this.n.add(new bcb(0, this.l / 2 - 155, this.m - 50, 150, 20, brp.a("gui.cancel", new Object[0])));
/*  60 */       this.n.add(new bcb(1, this.l / 2 - 155 + 160, this.m - 50, 150, 20, brp.a(this.h.b().d(), new Object[0])));
/*     */     } else {
/*  62 */       this.n.add(new bcb(0, this.l / 2 - 75, this.m - 50, 150, 20, brp.a("gui.cancel", new Object[0])));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void m() {}
/*     */   
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/*  72 */     c();
/*     */     
/*  74 */     int j = Math.max((int)(this.m * 0.85D / 2.0D - this.r.size() * this.q.a / 2.0F), 50);
/*  75 */     a(this.q, this.f.d(), this.l / 2, j - this.q.a * 2, 16777215);
/*     */     
/*  77 */     for (String str : this.r) {
/*  78 */       a(this.q, str, this.l / 2, j, 10526880);
/*  79 */       j += this.q.a;
/*     */     }
/*     */     
/*  82 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  87 */     if (!parambcb.l) { return;
/*     */     }
/*  89 */     if (parambcb.k == 1) {
/*  90 */       switch (bgq.a[this.h.ordinal()]) {
/*     */       case 1: 
/*     */       case 2: 
/*  93 */         a("https://account.mojang.com/me/settings");
/*  94 */         break;
/*     */       case 3: 
/*  96 */         a("https://account.mojang.com/migrate");
/*  97 */         break;
/*     */       case 4: 
/*  99 */         a("http://www.apple.com/osx/");
/* 100 */         break;
/*     */       case 5: 
/*     */       case 6: 
/*     */       case 7: 
/* 104 */         a("http://bugs.mojang.com/browse/MC");
/*     */       }
/*     */       
/*     */     }
/*     */     
/* 109 */     this.k.a(this.g);
/*     */   }
/*     */   
/*     */   private void a(String paramString) {
/*     */     try {
/* 114 */       Class localClass = Class.forName("java.awt.Desktop");
/* 115 */       Object localObject = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 116 */       localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject, new Object[] { new URI(paramString) });
/*     */     } catch (Throwable localThrowable) {
/* 118 */       a.error("Couldn't open link", localThrowable);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(bdw parambdw) {
/* 123 */     bao localbao = bao.B();
/* 124 */     bum localbum = localbao.Z();
/*     */     Object localObject;
/* 126 */     if (!buu.n) {
/* 127 */       localObject = Lists.newArrayList();
/* 128 */       ((List)localObject).add(new fr("stream.unavailable.no_fbo.version", new Object[] { GL11.glGetString(7938) }));
/* 129 */       ((List)localObject).add(new fr("stream.unavailable.no_fbo.blend", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_EXT_blend_func_separate) }));
/* 130 */       ((List)localObject).add(new fr("stream.unavailable.no_fbo.arb", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_ARB_framebuffer_object) }));
/* 131 */       ((List)localObject).add(new fr("stream.unavailable.no_fbo.ext", new Object[] { Boolean.valueOf(GLContext.getCapabilities().GL_EXT_framebuffer_object) }));
/*     */       
/* 133 */       localbao.a(new bgp(parambdw, bgr.a, (List)localObject));
/* 134 */     } else if ((localbum instanceof bur)) {
/* 135 */       if (((bur)localbum).a().getMessage().contains("Can't load AMD 64-bit .dll on a IA 32-bit platform")) {
/* 136 */         localbao.a(new bgp(parambdw, bgr.b));
/*     */       } else
/* 138 */         localbao.a(new bgp(parambdw, bgr.c));
/*     */     } else {
/* 140 */       if ((!localbum.D()) && (localbum.E() == ErrorCode.TTV_EC_OS_TOO_OLD)) {}
/* 141 */       switch (bgq.b[u.a().ordinal()]) {
/*     */       case 1: 
/* 143 */         localbao.a(new bgp(parambdw, bgr.d));
/* 144 */         break;
/*     */       case 2: 
/* 146 */         localbao.a(new bgp(parambdw, bgr.e));
/* 147 */         break;
/*     */       default: 
/* 149 */         localbao.a(new bgp(parambdw, bgr.f)); break;
/*     */         
/* 151 */         if (!localbao.N().containsKey("twitch_access_token")) {
/* 152 */           if (localbao.M().f() == bbt.a) {
/* 153 */             localbao.a(new bgp(parambdw, bgr.g));
/*     */           } else {
/* 155 */             localbao.a(new bgp(parambdw, bgr.h));
/*     */           }
/* 157 */         } else if (!localbum.F()) {
/* 158 */           switch (bgq.c[localbum.H().ordinal()]) {
/*     */           case 1: 
/* 160 */             localbao.a(new bgp(parambdw, bgr.i));
/* 161 */             break;
/*     */           case 2: 
/*     */           default: 
/* 164 */             localbao.a(new bgp(parambdw, bgr.j));break;
/*     */           }
/* 166 */         } else if (localbum.E() != null) {
/* 167 */           localObject = Arrays.asList(new fr[] { new fr("stream.unavailable.initialization_failure.extra", new Object[] { ErrorCode.getString(localbum.E()) }) });
/* 168 */           localbao.a(new bgp(parambdw, bgr.k, (List)localObject));
/*     */         } else {
/* 170 */           localbao.a(new bgp(parambdw, bgr.l));
/*     */         }
/*     */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */