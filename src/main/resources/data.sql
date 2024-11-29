-- Crear permisos
INSERT INTO permiso (id, nombre) VALUES
                                      (1, 'ADMINISTRAR_USUARIOS'),
                                      (2, 'GESTIONAR_CURSOS'),
                                      (3, 'VISUALIZAR_REPORTES')
    ON CONFLICT (id) DO NOTHING;

-- Crear roles
INSERT INTO rol (id, nombre) VALUES
                                   (1, 'ADMINISTRADOR'),
                                   (2, 'PROFESOR'),
                                   (3, 'DIRECTOR'),
                                   (3, 'ADMINISTRATIVO')
    ON CONFLICT (id) DO NOTHING;

--Crear Financiamiento
INSERT INTO financiamiento (id, nombre) VALUES
                                   (1, 'MINISTERIO DE EDUCACION'),
                                   (2, 'ONG'),
                                   (3, 'IGLESIA'),
                                   (4, 'GOBIERNO MUNICIPAL'),
                                   (5, 'COMUNAL(TODA LA COMUNIDAD)'),
                                   (6, 'AD HONOREM'),
                                   (7, 'RECURSOS PROPIOS'),
                                   (8, 'GOBIERNO DEPARTAMENTAL'),
                                   (9, 'PADRES DE FAMILIA'),
                                   (10,'TGN.OTROS')
    ON CONFLICT (id) DO NOTHING;

--Crear Funcion
INSERT INTO funcion (id, nombre) VALUES
                                   (1, 'DIRECTOR/A'),
                                   (2, 'SECRETARIA/O'),
                                   (3, 'REGENTE'),
                                   (4, 'PORTERO/A'),
                                   (5, 'OTRO ADMINISTRATIVO'),
                                   (6, 'NIÑERO/A'),
                                   (7, 'DIRECTOR/A ENCARGADO/A'),
                                   (8, 'AUXILIAR'),
                                   (3, 'COMISIONADO-ORGANIZACIÓN SOCIAL')

    ON CONFLICT (id) DO NOTHING;

--Crear Formacion
INSERT INTO formacion (id, nombre) VALUES
                                   (1, 'TITULADO NORMALISTA'),
                                   (2, 'EGRESADO NORMALISTA'),
                                   (3, 'TITULO POR ANTIGUEDAD'),
                                   (4, 'EXT.O NAL.REVAL. NORMISTA'),
                                   (5, 'LICENCIADO UNIVERSITARIO'),
                                   (6, 'EGRESADO UNIVERSITARIO'),
                                   (7, 'TITULADO TECNICO SUPERIOR'),
                                   (8, 'TITULADO TECNICO MEDIO'),
                                   (9, 'BACHILLER'),
                                   (10, 'EGRESADO TECNICO MEDIO'),
                                   (11, 'EGRESADO TECNICO SUPERIOR'),
                                   (12, 'PROFESOR EGRESADO PPMI'),
                                   (13, 'LIENCIATURA EN CIENCIAS DE LA EDUCACION Y/O'),
                                   (14, 'NORMALISTA CON TITULO REVALIDADO DEL EXTERIOR'),
                                   (15, 'EGRESADO UNIVERSITARIO EN CIENCIAS DE LA EDUCACION'),
                                   (16, 'TITULADO PPMI'),
                                   (17, 'EGRESADO PPMI'),
                                   (18, 'LICENCIATURA EN CARRERAS DIFERENTES A CIENCIAAA'),
                                   (19, 'EGRESADO UNIVERSITARIO DE CARRERAS DIFERENTES'),
                                   (20, 'BACHILERATO INCOMPLETO'),
                                   (21, 'TITULADO TECNICO BASICO'),
                                   (22, 'EGRESADO TECNICO BASICO'),
                                   (23, 'TITULADO AUXILIAR BASICO'),
                                   (24, 'EGRESADO AUXILIAR BASICO'),
                                   (25, 'TITULADO MAESTRIA'),
                                   (26, 'EGRESADO MAESTRIA'),
                                   (27, 'TITULADO DOCTORADO'),
                                   (28, 'EGRESADO DOCTORADO')
ON CONFLICT (id) DO NOTHING;

--Crear Idioma
INSERT INTO idioma (id, nombre) VALUES
                                     (1, 'CHIRIGUANO'),
                                     (2, 'ESE EJA'),
                                     (3, 'GUARASUG’WE'),
                                     (4, 'GUARAYOS'),
                                     (5, 'IRUITO'),
                                     (6, 'ITONAMA'),
                                     (7, 'IZOZEÑO'),
                                     (8, 'JAQI'),
                                     (9, 'LECO'),
                                     (10, 'MATACO MÁKÁ'),
                                     (11, 'MATACOS NOCTENNE'),
                                     (12, 'MOXENO'),
                                     (13, 'MOJEÑO TRINITARIO'),
                                     (14, 'MOJEÑO IGNACIANO'),
                                     (15, 'MORE'),
                                     (16, 'PACAWARA'),
                                     (17, 'URUP CHIPAYA'),
                                     (18, 'TACANA'),
                                     (19, 'TAPIETE'),
                                     (20, 'TOROMONA'),
                                     (21, 'TUPIGUARANI'),
                                     (22, 'URU'),
                                     (23, 'YAMINAHUA'),
                                     (24, 'YURAKARE'),
                                     (25, 'YUKI'),
                                     (26, 'ZAMUCO'),
                                     (27, 'PUKINA (PUQUI)'),
                                     (28, 'TISMANE'),
                                     (29, 'WEENHAYEK'),
                                     (30, 'CASTELLANO'),
                                     (31, 'BESIRO'),
                                     (32, 'RUSO'),
                                     (33, 'PORTUGUES'),
                                     (34, 'INGLES'),
                                     (35, 'FRANCES'),
                                     (36, 'ALEMAN'),
                                     (37, 'TRINITARIO'),
                                     (38, 'JAPONES'),
                                     (39, 'MACHINERI'),
                                     (40, 'LENGUA DE SEÑAS BOL'),
                                     (41, 'MACHAJUYAI-KALLAWAYA'),
                                     (42, 'MAROPA')

    ON CONFLICT (id) DO NOTHING;

-- Crear turnos
INSERT INTO turno (id, nombre) VALUES
                                     (1, 'MAÑANA'),
                                     (2, 'TARDE'),
                                     (3, 'NOCHE')
    ON CONFLICT (id) DO NOTHING;
