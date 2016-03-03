/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.lwjgl.opengl.ARBFramebufferObject;
/*     */ import org.lwjgl.opengl.ARBMultitexture;
/*     */ import org.lwjgl.opengl.ARBShaderObjects;
/*     */ import org.lwjgl.opengl.ARBVertexShader;
/*     */ import org.lwjgl.opengl.ContextCapabilities;
/*     */ import org.lwjgl.opengl.EXTBlendFuncSeparate;
/*     */ import org.lwjgl.opengl.EXTFramebufferObject;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GL13;
/*     */ import org.lwjgl.opengl.GL14;
/*     */ import org.lwjgl.opengl.GL20;
/*     */ import org.lwjgl.opengl.GL30;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class buu
/*     */ {
/*     */   public static boolean a;
/*     */   public static int b;
/*     */   public static int c;
/*     */   public static boolean d;
/*     */   public static int e;
/*     */   public static int f;
/*     */   public static int g;
/*     */   public static int h;
/*     */   public static int i;
/*     */   public static int j;
/*     */   public static int k;
/*     */   public static int l;
/*     */   public static int m;
/*     */   private static int w;
/*     */   public static boolean n;
/*     */   private static boolean x;
/*     */   private static boolean y;
/*     */   public static int o;
/*     */   public static int p;
/*     */   public static int q;
/*     */   public static int r;
/*     */   public static boolean s;
/*     */   public static int t;
/*     */   private static boolean z;
/*     */   private static boolean A;
/*     */   public static boolean u;
/*     */   public static boolean v;
/*  50 */   private static String B = "";
/*     */   
/*     */   public static void a() {
/*  53 */     ContextCapabilities localContextCapabilities = GLContext.getCapabilities();
/*  54 */     z = (localContextCapabilities.GL_ARB_multitexture) && (!localContextCapabilities.OpenGL13);
/*     */     
/*  56 */     if (z) {
/*  57 */       B += "Using multitexturing ARB.\n";
/*  58 */       b = 33984;
/*  59 */       c = 33985;
/*     */     } else {
/*  61 */       B += "Using GL 1.3 multitexturing.\n";
/*  62 */       b = 33984;
/*  63 */       c = 33985;
/*     */     }
/*     */     
/*  66 */     u = (localContextCapabilities.GL_EXT_blend_func_separate) && (!localContextCapabilities.OpenGL14);
/*  67 */     A = (localContextCapabilities.OpenGL14) || (localContextCapabilities.GL_EXT_blend_func_separate);
/*  68 */     n = (A) && ((localContextCapabilities.GL_ARB_framebuffer_object) || (localContextCapabilities.GL_EXT_framebuffer_object) || (localContextCapabilities.OpenGL30));
/*  69 */     if (n) {
/*  70 */       B += "Using framebuffer objects because ";
/*  71 */       if (localContextCapabilities.OpenGL30) {
/*  72 */         B += "OpenGL 3.0 is supported and separate blending is supported.\n";
/*  73 */         w = 0;
/*  74 */         e = 36160;
/*  75 */         f = 36161;
/*  76 */         g = 36064;
/*  77 */         h = 36096;
/*  78 */         i = 36053;
/*  79 */         j = 36054;
/*  80 */         k = 36055;
/*  81 */         l = 36059;
/*  82 */         m = 36060;
/*  83 */       } else if (localContextCapabilities.GL_ARB_framebuffer_object) {
/*  84 */         B += "ARB_framebuffer_object is supported and separate blending is supported.\n";
/*  85 */         w = 1;
/*  86 */         e = 36160;
/*  87 */         f = 36161;
/*  88 */         g = 36064;
/*  89 */         h = 36096;
/*  90 */         i = 36053;
/*  91 */         k = 36055;
/*  92 */         j = 36054;
/*  93 */         l = 36059;
/*  94 */         m = 36060;
/*  95 */       } else if (localContextCapabilities.GL_EXT_framebuffer_object) {
/*  96 */         B += "EXT_framebuffer_object is supported.\n";
/*  97 */         w = 2;
/*  98 */         e = 36160;
/*  99 */         f = 36161;
/* 100 */         g = 36064;
/* 101 */         h = 36096;
/* 102 */         i = 36053;
/* 103 */         k = 36055;
/* 104 */         j = 36054;
/* 105 */         l = 36059;
/* 106 */         m = 36060;
/*     */       }
/*     */     } else {
/* 109 */       B += "Not using framebuffer objects because ";
/* 110 */       B = B + "OpenGL 1.4 is " + (localContextCapabilities.OpenGL14 ? "" : "not ") + "supported, ";
/* 111 */       B = B + "EXT_blend_func_separate is " + (localContextCapabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
/* 112 */       B = B + "OpenGL 3.0 is " + (localContextCapabilities.OpenGL30 ? "" : "not ") + "supported, ";
/* 113 */       B = B + "ARB_framebuffer_object is " + (localContextCapabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
/* 114 */       B = B + "EXT_framebuffer_object is " + (localContextCapabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
/*     */     }
/*     */     
/* 117 */     s = localContextCapabilities.GL_EXT_texture_filter_anisotropic;
/* 118 */     t = (int)(s ? GL11.glGetFloat(34047) : 0.0F);
/* 119 */     B = B + "Anisotropic filtering is " + (s ? "" : "not ") + "supported";
/* 120 */     if (s) {
/* 121 */       B = B + " and maximum anisotropy is " + t + ".\n";
/*     */     } else {
/* 123 */       B += ".\n";
/*     */     }
/*     */     
/* 126 */     bbm.G.a(t);
/*     */     
/* 128 */     a = localContextCapabilities.OpenGL21;
/* 129 */     x = (a) || ((localContextCapabilities.GL_ARB_vertex_shader) && (localContextCapabilities.GL_ARB_fragment_shader) && (localContextCapabilities.GL_ARB_shader_objects));
/* 130 */     B = B + "Shaders are " + (x ? "" : "not ") + "available because ";
/* 131 */     if (x) {
/* 132 */       if (localContextCapabilities.OpenGL21) {
/* 133 */         B += "OpenGL 2.1 is supported.\n";
/* 134 */         y = false;
/* 135 */         o = 35714;
/* 136 */         p = 35713;
/* 137 */         q = 35633;
/* 138 */         r = 35632;
/*     */       } else {
/* 140 */         B += "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
/* 141 */         y = true;
/* 142 */         o = 35714;
/* 143 */         p = 35713;
/* 144 */         q = 35633;
/* 145 */         r = 35632;
/*     */       }
/*     */     } else {
/* 148 */       B = B + "OpenGL 2.1 is " + (localContextCapabilities.OpenGL21 ? "" : "not ") + "supported, ";
/* 149 */       B = B + "ARB_shader_objects is " + (localContextCapabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
/* 150 */       B = B + "ARB_vertex_shader is " + (localContextCapabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
/* 151 */       B = B + "ARB_fragment_shader is " + (localContextCapabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
/*     */     }
/* 153 */     v = (n) && (x);
/*     */     
/* 155 */     d = GL11.glGetString(7936).toLowerCase().contains("nvidia");
/*     */   }
/*     */   
/*     */   public static boolean b() {
/* 159 */     return v;
/*     */   }
/*     */   
/*     */   public static String c() {
/* 163 */     return B;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt1, int paramInt2) {
/* 167 */     if (y) {
/* 168 */       return ARBShaderObjects.glGetObjectParameteriARB(paramInt1, paramInt2);
/*     */     }
/* 170 */     return GL20.glGetProgrami(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static void b(int paramInt1, int paramInt2)
/*     */   {
/* 175 */     if (y) {
/* 176 */       ARBShaderObjects.glAttachObjectARB(paramInt1, paramInt2);
/*     */     } else {
/* 178 */       GL20.glAttachShader(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(int paramInt) {
/* 183 */     if (y) {
/* 184 */       ARBShaderObjects.glDeleteObjectARB(paramInt);
/*     */     } else {
/* 186 */       GL20.glDeleteShader(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 191 */     if (y) {
/* 192 */       return ARBShaderObjects.glCreateShaderObjectARB(paramInt);
/*     */     }
/* 194 */     return GL20.glCreateShader(paramInt);
/*     */   }
/*     */   
/*     */   public static void a(int paramInt, ByteBuffer paramByteBuffer)
/*     */   {
/* 199 */     if (y) {
/* 200 */       ARBShaderObjects.glShaderSourceARB(paramInt, paramByteBuffer);
/*     */     } else {
/* 202 */       GL20.glShaderSource(paramInt, paramByteBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c(int paramInt) {
/* 207 */     if (y) {
/* 208 */       ARBShaderObjects.glCompileShaderARB(paramInt);
/*     */     } else {
/* 210 */       GL20.glCompileShader(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int c(int paramInt1, int paramInt2) {
/* 215 */     if (y) {
/* 216 */       return ARBShaderObjects.glGetObjectParameteriARB(paramInt1, paramInt2);
/*     */     }
/* 218 */     return GL20.glGetShaderi(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static String d(int paramInt1, int paramInt2)
/*     */   {
/* 223 */     if (y) {
/* 224 */       return ARBShaderObjects.glGetInfoLogARB(paramInt1, paramInt2);
/*     */     }
/* 226 */     return GL20.glGetShaderInfoLog(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static String e(int paramInt1, int paramInt2)
/*     */   {
/* 231 */     if (y) {
/* 232 */       return ARBShaderObjects.glGetInfoLogARB(paramInt1, paramInt2);
/*     */     }
/* 234 */     return GL20.glGetProgramInfoLog(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static void d(int paramInt)
/*     */   {
/* 239 */     if (y) {
/* 240 */       ARBShaderObjects.glUseProgramObjectARB(paramInt);
/*     */     } else {
/* 242 */       GL20.glUseProgram(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int d() {
/* 247 */     if (y) {
/* 248 */       return ARBShaderObjects.glCreateProgramObjectARB();
/*     */     }
/* 250 */     return GL20.glCreateProgram();
/*     */   }
/*     */   
/*     */   public static void e(int paramInt)
/*     */   {
/* 255 */     if (y) {
/* 256 */       ARBShaderObjects.glDeleteObjectARB(paramInt);
/*     */     } else {
/* 258 */       GL20.glDeleteProgram(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void f(int paramInt) {
/* 263 */     if (y) {
/* 264 */       ARBShaderObjects.glLinkProgramARB(paramInt);
/*     */     } else {
/* 266 */       GL20.glLinkProgram(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(int paramInt, CharSequence paramCharSequence) {
/* 271 */     if (y) {
/* 272 */       return ARBShaderObjects.glGetUniformLocationARB(paramInt, paramCharSequence);
/*     */     }
/* 274 */     return GL20.glGetUniformLocation(paramInt, paramCharSequence);
/*     */   }
/*     */   
/*     */   public static void a(int paramInt, IntBuffer paramIntBuffer)
/*     */   {
/* 279 */     if (y) {
/* 280 */       ARBShaderObjects.glUniform1ARB(paramInt, paramIntBuffer);
/*     */     } else {
/* 282 */       GL20.glUniform1(paramInt, paramIntBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void f(int paramInt1, int paramInt2) {
/* 287 */     if (y) {
/* 288 */       ARBShaderObjects.glUniform1iARB(paramInt1, paramInt2);
/*     */     } else {
/* 290 */       GL20.glUniform1i(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(int paramInt, FloatBuffer paramFloatBuffer) {
/* 295 */     if (y) {
/* 296 */       ARBShaderObjects.glUniform1ARB(paramInt, paramFloatBuffer);
/*     */     } else {
/* 298 */       GL20.glUniform1(paramInt, paramFloatBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void b(int paramInt, IntBuffer paramIntBuffer) {
/* 303 */     if (y) {
/* 304 */       ARBShaderObjects.glUniform2ARB(paramInt, paramIntBuffer);
/*     */     } else {
/* 306 */       GL20.glUniform2(paramInt, paramIntBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void b(int paramInt, FloatBuffer paramFloatBuffer) {
/* 311 */     if (y) {
/* 312 */       ARBShaderObjects.glUniform2ARB(paramInt, paramFloatBuffer);
/*     */     } else {
/* 314 */       GL20.glUniform2(paramInt, paramFloatBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c(int paramInt, IntBuffer paramIntBuffer) {
/* 319 */     if (y) {
/* 320 */       ARBShaderObjects.glUniform3ARB(paramInt, paramIntBuffer);
/*     */     } else {
/* 322 */       GL20.glUniform3(paramInt, paramIntBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c(int paramInt, FloatBuffer paramFloatBuffer) {
/* 327 */     if (y) {
/* 328 */       ARBShaderObjects.glUniform3ARB(paramInt, paramFloatBuffer);
/*     */     } else {
/* 330 */       GL20.glUniform3(paramInt, paramFloatBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void d(int paramInt, IntBuffer paramIntBuffer) {
/* 335 */     if (y) {
/* 336 */       ARBShaderObjects.glUniform4ARB(paramInt, paramIntBuffer);
/*     */     } else {
/* 338 */       GL20.glUniform4(paramInt, paramIntBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void d(int paramInt, FloatBuffer paramFloatBuffer) {
/* 343 */     if (y) {
/* 344 */       ARBShaderObjects.glUniform4ARB(paramInt, paramFloatBuffer);
/*     */     } else {
/* 346 */       GL20.glUniform4(paramInt, paramFloatBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(int paramInt, boolean paramBoolean, FloatBuffer paramFloatBuffer) {
/* 351 */     if (y) {
/* 352 */       ARBShaderObjects.glUniformMatrix2ARB(paramInt, paramBoolean, paramFloatBuffer);
/*     */     } else {
/* 354 */       GL20.glUniformMatrix2(paramInt, paramBoolean, paramFloatBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void b(int paramInt, boolean paramBoolean, FloatBuffer paramFloatBuffer) {
/* 359 */     if (y) {
/* 360 */       ARBShaderObjects.glUniformMatrix3ARB(paramInt, paramBoolean, paramFloatBuffer);
/*     */     } else {
/* 362 */       GL20.glUniformMatrix3(paramInt, paramBoolean, paramFloatBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c(int paramInt, boolean paramBoolean, FloatBuffer paramFloatBuffer) {
/* 367 */     if (y) {
/* 368 */       ARBShaderObjects.glUniformMatrix4ARB(paramInt, paramBoolean, paramFloatBuffer);
/*     */     } else {
/* 370 */       GL20.glUniformMatrix4(paramInt, paramBoolean, paramFloatBuffer);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int b(int paramInt, CharSequence paramCharSequence) {
/* 375 */     if (y) {
/* 376 */       return ARBVertexShader.glGetAttribLocationARB(paramInt, paramCharSequence);
/*     */     }
/* 378 */     return GL20.glGetAttribLocation(paramInt, paramCharSequence);
/*     */   }
/*     */   
/*     */   public static void g(int paramInt1, int paramInt2)
/*     */   {
/* 383 */     if (!n) return;
/* 384 */     switch (w) {
/*     */     case 0: 
/* 386 */       GL30.glBindFramebuffer(paramInt1, paramInt2);
/* 387 */       break;
/*     */     case 1: 
/* 389 */       ARBFramebufferObject.glBindFramebuffer(paramInt1, paramInt2);
/* 390 */       break;
/*     */     case 2: 
/* 392 */       EXTFramebufferObject.glBindFramebufferEXT(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void h(int paramInt1, int paramInt2)
/*     */   {
/* 398 */     if (!n) return;
/* 399 */     switch (w) {
/*     */     case 0: 
/* 401 */       GL30.glBindRenderbuffer(paramInt1, paramInt2);
/* 402 */       break;
/*     */     case 1: 
/* 404 */       ARBFramebufferObject.glBindRenderbuffer(paramInt1, paramInt2);
/* 405 */       break;
/*     */     case 2: 
/* 407 */       EXTFramebufferObject.glBindRenderbufferEXT(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void g(int paramInt)
/*     */   {
/* 413 */     if (!n) return;
/* 414 */     switch (w) {
/*     */     case 0: 
/* 416 */       GL30.glDeleteRenderbuffers(paramInt);
/* 417 */       break;
/*     */     case 1: 
/* 419 */       ARBFramebufferObject.glDeleteRenderbuffers(paramInt);
/* 420 */       break;
/*     */     case 2: 
/* 422 */       EXTFramebufferObject.glDeleteRenderbuffersEXT(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void h(int paramInt)
/*     */   {
/* 428 */     if (!n) return;
/* 429 */     switch (w) {
/*     */     case 0: 
/* 431 */       GL30.glDeleteFramebuffers(paramInt);
/* 432 */       break;
/*     */     case 1: 
/* 434 */       ARBFramebufferObject.glDeleteFramebuffers(paramInt);
/* 435 */       break;
/*     */     case 2: 
/* 437 */       EXTFramebufferObject.glDeleteFramebuffersEXT(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int e()
/*     */   {
/* 443 */     if (!n) return -1;
/* 444 */     switch (w) {
/*     */     case 0: 
/* 446 */       return GL30.glGenFramebuffers();
/*     */     case 1: 
/* 448 */       return ARBFramebufferObject.glGenFramebuffers();
/*     */     case 2: 
/* 450 */       return EXTFramebufferObject.glGenFramebuffersEXT();
/*     */     }
/* 452 */     return -1;
/*     */   }
/*     */   
/*     */   public static int f() {
/* 456 */     if (!n) return -1;
/* 457 */     switch (w) {
/*     */     case 0: 
/* 459 */       return GL30.glGenRenderbuffers();
/*     */     case 1: 
/* 461 */       return ARBFramebufferObject.glGenRenderbuffers();
/*     */     case 2: 
/* 463 */       return EXTFramebufferObject.glGenRenderbuffersEXT();
/*     */     }
/* 465 */     return -1;
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 469 */     if (!n) return;
/* 470 */     switch (w) {
/*     */     case 0: 
/* 472 */       GL30.glRenderbufferStorage(paramInt1, paramInt2, paramInt3, paramInt4);
/* 473 */       break;
/*     */     case 1: 
/* 475 */       ARBFramebufferObject.glRenderbufferStorage(paramInt1, paramInt2, paramInt3, paramInt4);
/* 476 */       break;
/*     */     case 2: 
/* 478 */       EXTFramebufferObject.glRenderbufferStorageEXT(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 484 */     if (!n) return;
/* 485 */     switch (w) {
/*     */     case 0: 
/* 487 */       GL30.glFramebufferRenderbuffer(paramInt1, paramInt2, paramInt3, paramInt4);
/* 488 */       break;
/*     */     case 1: 
/* 490 */       ARBFramebufferObject.glFramebufferRenderbuffer(paramInt1, paramInt2, paramInt3, paramInt4);
/* 491 */       break;
/*     */     case 2: 
/* 493 */       EXTFramebufferObject.glFramebufferRenderbufferEXT(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int i(int paramInt)
/*     */   {
/* 499 */     if (!n) return -1;
/* 500 */     switch (w) {
/*     */     case 0: 
/* 502 */       return GL30.glCheckFramebufferStatus(paramInt);
/*     */     case 1: 
/* 504 */       return ARBFramebufferObject.glCheckFramebufferStatus(paramInt);
/*     */     case 2: 
/* 506 */       return EXTFramebufferObject.glCheckFramebufferStatusEXT(paramInt);
/*     */     }
/* 508 */     return -1;
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 512 */     if (!n) return;
/* 513 */     switch (w) {
/*     */     case 0: 
/* 515 */       GL30.glFramebufferTexture2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 516 */       break;
/*     */     case 1: 
/* 518 */       ARBFramebufferObject.glFramebufferTexture2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 519 */       break;
/*     */     case 2: 
/* 521 */       EXTFramebufferObject.glFramebufferTexture2DEXT(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void j(int paramInt)
/*     */   {
/* 527 */     if (z) {
/* 528 */       ARBMultitexture.glActiveTextureARB(paramInt);
/*     */     } else {
/* 530 */       GL13.glActiveTexture(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void k(int paramInt) {
/* 535 */     if (z) {
/* 536 */       ARBMultitexture.glClientActiveTextureARB(paramInt);
/*     */     } else {
/* 538 */       GL13.glClientActiveTexture(paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(int paramInt, float paramFloat1, float paramFloat2) {
/* 543 */     if (z) {
/* 544 */       ARBMultitexture.glMultiTexCoord2fARB(paramInt, paramFloat1, paramFloat2);
/*     */     } else {
/* 546 */       GL13.glMultiTexCoord2f(paramInt, paramFloat1, paramFloat2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 551 */     if (A) {
/* 552 */       if (u) {
/* 553 */         EXTBlendFuncSeparate.glBlendFuncSeparateEXT(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */       } else {
/* 555 */         GL14.glBlendFuncSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */       }
/*     */     } else {
/* 558 */       GL11.glBlendFunc(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean g() {
/* 563 */     return (n) && (bao.B().u.g);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\buu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */